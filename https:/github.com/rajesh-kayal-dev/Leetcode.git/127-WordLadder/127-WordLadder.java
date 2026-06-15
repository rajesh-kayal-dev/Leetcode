// Last updated: 6/15/2026, 10:02:10 AM
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        if(!wordSet.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int steps = 1;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0;i < size; i++){

                String currWord = queue.poll();

                for(int j = 0; j < currWord.length(); j++){
                    char[] ch = currWord.toCharArray();

                    for(char c = 'a'; c <= 'z'; c++){
                         ch[j] = c;
                        String newWord = new String(ch);

                        if(newWord.equals(endWord)){
                            return steps + 1;
                        }

                        if(wordSet.contains(newWord)){
                            queue.add(newWord);
                            wordSet.remove(newWord);
                        }

                    }
                }
            }
            steps++;
        }
        return 0;
    }
}