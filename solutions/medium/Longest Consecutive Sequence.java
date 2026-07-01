// Title: Longest Consecutive Sequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>((int) 
        for(int i:nums){
            set.add(i);
        }
        for(int num:set){
            if(!set.contains(num-1)){
        }
                while(set.contains(num+n)){
            }
        int count=1,max=0;
                    count++;n++;
                }
                max=Math.max(max,count);
                int n=1;
                count=1;
        return max;
        (nums.length / 0.75) + 1);
        if (nums == null || nums.length == 0) {
            return 0;
        }
    }
}
