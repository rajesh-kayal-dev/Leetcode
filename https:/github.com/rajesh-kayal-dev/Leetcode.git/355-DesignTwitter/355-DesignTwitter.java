// Last updated: 6/15/2026, 10:00:35 AM
class Twitter {

    private static int timestamp = 0;

    class Tweet {
        int time;
        int tweetId;
        Tweet next;

        Tweet(int tweetId) {
            this.tweetId = tweetId;
            this.time = timestamp++;
            this.next = null;
        }
    }

    Map<Integer, Set<Integer>> followMap;
    Map<Integer, Tweet> tweetMap;

    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    // Post a new tweet
    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(tweetId);
        tweet.next = tweetMap.get(userId);
        tweetMap.put(userId, tweet);
    }

    // Get the 10 most recent tweet ids
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> heap = new PriorityQueue<>(
            (a, b) -> b.time - a.time // Max heap by time
        );

        // Add user's own tweet
        if (tweetMap.containsKey(userId)) {
            heap.offer(tweetMap.get(userId));
        }

        // Add followees' tweets
        Set<Integer> followees = followMap.getOrDefault(userId, new HashSet<>());
        for (int followeeId : followees) {
            if (tweetMap.containsKey(followeeId)) {
                heap.offer(tweetMap.get(followeeId));
            }
        }

        // Get top 10 tweets
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty() && result.size() < 10) {
            Tweet top = heap.poll();
            result.add(top.tweetId);
            if (top.next != null) {
                heap.offer(top.next);
            }
        }

        return result;
    }

    // Follow a user
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    // Unfollow a user
    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}
