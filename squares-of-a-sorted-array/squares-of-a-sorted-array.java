class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output= new int[nums.length];
        
        int i=0,j=nums.length-1, k=nums.length-1;
        
         while(i<=j){

             if(Math.abs(nums[i])>Math.abs(nums[j])){
                output[k]= nums[i]*nums[i];
                 i++;
             }
             
             else{
                output[k]= nums[j]*nums[j];
                j--;
             }
              k--;
        }
        


        return output;
    }
}