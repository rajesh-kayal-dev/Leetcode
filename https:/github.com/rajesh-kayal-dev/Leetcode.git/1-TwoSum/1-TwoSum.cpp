// Last updated: 6/15/2026, 10:03:52 AM
class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int x) {
        int ans[2];
        bool flag=false;
        for(int i =0;i<arr.size();i++){
            for(int j =i+1;j<arr.size();j++){
                if(arr[i]+arr[j]==x){
                   return{i, j};
                    flag=true;
                    break;
                }
            }
        }
        return{};
        
    }
};