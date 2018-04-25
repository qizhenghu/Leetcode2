class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {        
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        
        int areaOne = (C-A)* (D-B);
        int areaTwo = (G-E) * (H-F);
        
        int area = areaOne + areaTwo;
        if(left < right && bottom < top){
          area = area - (right-left)*(top-bottom);
        }
        
        return area;
    }
}
