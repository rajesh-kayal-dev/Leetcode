class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //approch 1
        /*Arrays.sort(nums);
        for(int i =0;i<nums.length -1;i++){
            if(nums[i] == nums[i+1] ){
                return true;
            }
        }
        return false;
        */
        
        //approch 1 using Hashset

        HashSet <Integer> hs= new HashSet<>();//empty HashSet[]

        for(int i = 0; i<nums.length;i++){ //tavers in array
            if(hs.contains(nums[i])){//if hashset ke andar element
            return true; // present hai to true return karo 
                        //initially hashset ke andr kohi element exist nhi kar raha hai 
                        //jab element sara store ho jayaega trurn true qki hashset duplicate
                        //element allow nhi karta element shuld be unique
            }else{
                hs.add(nums[i]); //hashset set mai element add karo [1,2,3,1]
            }
        }
        return false;

    }
}