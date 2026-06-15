// Last updated: 6/15/2026, 9:59:37 AM
class TimeMap {
    Map<String, List<Pair<Integer, String>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        //if key is not in map add it with new emptyList
        map.putIfAbsent(key, new ArrayList<>());
        //append new (timestamp, vlue)
        map.get(key).add(new Pair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair<Integer, String>> list = map.get(key);

        int low = 0, high = list.size() - 1;
        String result ="";
        //apply binary search to return the value with largest timestam <= given time
        while(low <= high){
            int mid = low + (high - low) /2;
            if(list.get(mid).getKey() <= timestamp){
                result = list.get(mid).getValue();
                low = mid + 1; 
            }else{
                //if current timestamp is largest then left
                high = mid - 1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */