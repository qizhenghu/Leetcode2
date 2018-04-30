class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }           
        };
        String[] number = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
          number[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(number, comp);
        if(number[0].charAt(0) == '0')
                    return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s: number){
          sb.append(s);
        }
        return sb.toString();
    }
}
