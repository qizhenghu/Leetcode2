class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(s);
        }
        return new ArrayList<List<String>>(map.values());
        
    }
}
