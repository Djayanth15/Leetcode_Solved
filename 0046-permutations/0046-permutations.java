class Solution {
    
    private void m1per(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] freq){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0; i<freq.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                m1per(nums,ans,temp,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        m1per(nums,ans,temp,freq);
        return ans;
    }
}