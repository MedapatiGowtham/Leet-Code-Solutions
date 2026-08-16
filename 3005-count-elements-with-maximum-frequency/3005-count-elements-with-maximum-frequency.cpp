class Solution {
public:
    int maxFrequencyElements(vector<int>& nums)
    {
        unordered_map<int, int> freq;
        for (int num : nums) 
        {
            freq[num]++;
        }
        int maxFreq = 0;
        for (auto& [num, count] : freq)
        {
            maxFreq = max(maxFreq, count);
        }
        int ans = 0;
        for (auto& [num, count] : freq)
        {
            if (count == maxFreq)
            {
                ans += count;
            }
        }
        return ans;
    }
};