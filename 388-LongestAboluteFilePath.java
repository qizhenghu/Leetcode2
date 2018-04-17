class Solution {
    public int lengthLongestPath(String input) {
      if(input == null || input == "") return 0;
      String[] items = input.split("\n");
      Stack<Integer> stack = new Stack<>();
      stack.push(0);
      int maxLen = 0;
      for(String item : items){
        int level = item.lastIndexOf("\t") + 1;
        while(level + 1 < stack.size()){
          stack.pop();
        }
        int len = stack.peek() + item.length() - level + 1;
        stack.push(len);
        if(item.contains(".")){
          maxLen = Math.max(len-1, maxLen);
        }
      }
      return maxLen;
    }
}
