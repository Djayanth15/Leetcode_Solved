class Solution {
    public int[] replaceElements(int[] arr) {
        int max_value=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0; i--){
            
            
            if(arr[i]> max_value){
                int temp=arr[i];
                arr[i]=max_value;
                max_value=temp;
            }
            else{
                arr[i]=max_value;
            }
            
        }
        return arr;
    }
}