// Last updated: 6/15/2026, 10:00:47 AM
class Solution {
public:
    void reverseString(vector<char>& s) {
        int start = 0;
        int end = s.size()-1;
        while(start < end)
        {
            swap(s[start],s[end]);
            start++;
            end--;
        }
        
    }
};