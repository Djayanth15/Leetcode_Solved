class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = -1;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
                index =i;
        }
        if(index == -1)
            return false;
        int j=1;
        while(j<arr.length-1){
            if((arr[j-1]<arr[j] && j<=index) || (arr[j]>arr[j+1] && j>=index))
                j++;
            else
                return false;
        }
        return true;
    }
}