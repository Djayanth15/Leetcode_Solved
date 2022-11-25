#User function Template for python3
from collections import deque

def printFirstNegativeInteger( A, N, K):
    # code here
    res=[]
    de= deque()
    i=j=0
    
    while(j<N):
        if A[j]<0:
            de.append(j)
        if de and de[0]<i:
            de.popleft()
        if j>=i+K-1:
            if de:
                res.append(A[de[0]])
            else:
                res.append(0)
            i+=1
        j+=1
        
    return res

#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        k = int(input())
        
        answer = printFirstNegativeInteger(a, n, k)
        for i in answer:
            print(i,end=" ")
        print()

        T -= 1


if __name__ == "__main__":
    main()


# } Driver Code Ends