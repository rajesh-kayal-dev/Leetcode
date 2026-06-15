// Last updated: 6/15/2026, 10:03:17 AM
#include <vector>
using namespace std;

class Solution {
public:
    int search(vector<int>& arr, int target) {
        if (arr.empty()) // Check if array is empty
            return -1;

        int start = 0, end = arr.size() - 1, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] >= arr[start]) {
                if (arr[start] <= target && arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] < target && arr[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1; // Element not found
    }
};
