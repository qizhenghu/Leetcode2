class Solution {
    private int min = Integer.MAX_VALUE;
    public int minMutation(String start, String end, String[] bank) {
        backtracking(start, end, bank, new boolean[bank.length], 0);
        return min == Integer.MAX_VALUE ? -1 : min;	
    }
    
    public void backtracking(String start, String end, String[] bank, boolean[] isTouched, int count){
        if(start.equals(end)) {
            min = Math.min(min, count);
            return;
        }          
        for(int i = 0; i < bank.length; i++){
            if(!isTouched[i] && dif(bank[i], start) == 1){
                isTouched[i] = true;
                backtracking(bank[i], end, bank, isTouched, count+1);
                isTouched[i] = false;
            }           
        }
    }
    
    private int dif(String s1, String s2){
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) count ++;           
        }
        return count;
    }
}
