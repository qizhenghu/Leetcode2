class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = nums[0];
        for(int i =0; i < nums.length; i++){
          result = result ^ nums[i];
        }
        return result;
    }
}
