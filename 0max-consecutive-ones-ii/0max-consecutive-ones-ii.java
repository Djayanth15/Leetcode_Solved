class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prev =0;
        int max=0;
        int curr=0;
        int zero=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                prev=curr;
                curr=0;
                zero=1;
            }
            else
                curr++;
            max= Math.max(max,prev+curr+zero);
        }
        return max;
    }
}