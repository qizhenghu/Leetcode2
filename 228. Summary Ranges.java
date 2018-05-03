class Solution {
    public List<String> summaryRanges(int[] nums) {     
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length ==0) return list;
        for(int i = 0; i < nums.length; i++){
            int start = nums[i];
            while(i < nums.length-1 && nums[i+1]-nums[i]==1){
                i++;
            }
            if(start != nums[i]){
                String temp = start + "->" + nums[i];
                list.add(temp);                
            }else{
                list.add(Integer.toString(start));
            }
        }
        return list;
    }
}
