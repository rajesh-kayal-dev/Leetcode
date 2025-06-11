class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> entry = new HashSet<>();
        //set is collection jo duplicate elements ko allow nahi karta.
        
        for(int i = 0; i < nums.length; i++){
            // Agar element pehle se set mein hai, to duplicate mila
            if(entry.contains(nums[i])){
                return true; 
            } else {
                // Naya element hai, to set mein add kar do
                entry.add(nums[i]);
            }
        }

        // Agar pura loop chal gaya aur duplicate nahi mila, to false return karo
        return false;
    }
}
