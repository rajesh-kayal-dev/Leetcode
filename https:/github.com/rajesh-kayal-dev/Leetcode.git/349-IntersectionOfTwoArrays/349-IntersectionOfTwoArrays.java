// Last updated: 6/15/2026, 10:00:38 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //nums1 = [1,2,2,1], nums2 = [2,2]
        HashSet<Integer> set = new HashSet<>();

        for(int n2 : nums2){//array 2 ko travers karo
            set.add(n2);//->[1,2,2,1]
        }

        ArrayList <Integer> list = new ArrayList<>();
        for(int n1 : nums1){//array 1 ko travers karo
            if(set.contains(n1)){//agar set main array 1 ka kohi value present hai 
                list.add(n1);//list mai array 1 add kardo
                set.remove(n1);//set se n1 ka duplicate value remove kardo
            }
        }

        int res[]=new int[list.size()]; //new array to strore result
        for(int i =0;i<list.size();i++){
            res[i]=list.get(i);//list ka index ko reslt ki index mai store karo
        }
        return res;
    }
}