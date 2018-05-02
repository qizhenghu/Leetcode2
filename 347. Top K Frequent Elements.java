class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: nums){
          map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int len = nums.length;
        List<Integer>[] bucket = new List[len+1];
        
        for(int n: map.keySet()){
          int freq = map.get(n);
          if(bucket[freq] == null){
            bucket[freq] = new ArrayList<Integer>();
          }
          bucket[freq].add(n);
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i = bucket.length-1; i >=0 && result.size() < k; i--){
          if(bucket[i]!=null){
            result.addAll(bucket[i]);
          }
        }
        return result;
    }
}
