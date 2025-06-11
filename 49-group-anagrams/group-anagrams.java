class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String str : strs){
            //covert string to char array
            char chars[] = str.toCharArray();
            Arrays.sort(chars);//sort the chars
            //conver sprted chars into string
            String key = new String(chars);

            //if frist time sorted list aya hai to usko list mai add karo
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            //add original key crseponding sorted string
            map.get(key).add(str);
        }
        //return group of anagram
        return new ArrayList<>(map.values());
    }
}
