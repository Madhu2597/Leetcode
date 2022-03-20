class Solution {
//     public int minDominoRotations(int[] tops, int[] bottoms) {
        
//     }
     public int minDominoRotations(int[] A, int[] B) {
        
        int top = findValue(A, B, A[0]);
        int bottom = findValue(A, B, B[0]);
        
        if (top >= 0 && bottom >= 0) {
            return Math.min(top, bottom);
        }
        else if (top >= 0)
            return top;
        else
            return bottom;
        
    }
    
    
    public int findValue(int [] A, int [] B, int value) {
        int topCount = 0, bottomCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != value && B[i] != value)
                return -1;
            else if (A[i] == value && B[i] != value)
                bottomCount += 1;
            else if (A[i] != value && B[i] == value)
                topCount += 1;
                
        }
        return Math.min(topCount, bottomCount);
    }
}