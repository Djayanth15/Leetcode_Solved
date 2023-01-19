
class Solution:
    #Back-end complete function Template for Python 3
    
    #Function to find the leaders in the array.
    def leaders(self, A, N):
        #Code here
        res = []
        res.append(A[N-1])
        max = A[N-1]
        
        for i in range(N-2,-1,-1):
            if A[i] >= max:
                res.append(A[i])
                max = A[i]
        
        left, right = 0, len(res) - 1
        
        while left < right:
            res[left], res[right] = res[right], res[left]
            left += 1
            right -= 1
        
        return res
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math


    
def main():
    
    T=int(input())
    
    while(T>0):
        
        
        N=int(input())
        
        A=[int(x) for x in input().strip().split()]
        obj = Solution()
        
        A=obj.leaders(A,N)
        
        for i in A:
            print(i,end=" ")
        print()
        
        T-=1

if __name__=="__main__":
    main()
# } Driver Code Ends