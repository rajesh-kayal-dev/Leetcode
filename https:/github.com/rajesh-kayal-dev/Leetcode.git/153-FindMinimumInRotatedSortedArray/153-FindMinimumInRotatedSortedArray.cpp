// Last updated: 6/15/2026, 10:01:56 AM
class Solution {
public:
    int findMin(vector<int>& arr) {
        int start=0,end=arr.size()-1,ans=arr[0];
        while(start<=end)
        {
            int mid= start+ (end - start)/2;
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }else{
                ans=arr[mid];
                end=mid-1;
            }
        }
        return ans;
    }
};