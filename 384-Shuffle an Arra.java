class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffled = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            int j = (int)(Math.random()*(i+1));
            shuffled[i] = shuffled[j];
            shuffled[j] = nums[i];
        }
        
        return shuffled;
        
    }
}
