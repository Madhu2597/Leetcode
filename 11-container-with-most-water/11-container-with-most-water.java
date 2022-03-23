class Solution {
    public int maxArea(int[] height) {
        int maxW=0;
        int i=0,j=height.length-1;
        while(i<j){
            int l=j-i;
            int h=Math.min(height[i],height[j]);
            int w=l*h;
            maxW=Math.max(maxW,w);
            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return maxW;
    }
}