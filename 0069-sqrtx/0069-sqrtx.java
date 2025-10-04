class Solution {
    public int mySqrt(int n) {
        	if (n==0|| n==1) 
			return n;

	int low = 0, high=n/2;
	int ans=0;

	while(low <= high){
		int mid = low + (high - low)/2;
		long squre =(long) mid*mid;
		if (squre == n) {
			return mid;
		}else if (squre<n) {
			ans=mid;
			low=mid+1;//search right
		}else{
			high=mid -1;//search left
		}
	}
	return ans;
    }
}