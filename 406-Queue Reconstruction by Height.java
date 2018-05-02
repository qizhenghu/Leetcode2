class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people==null || people.length ==0 || people[0].length==0){
          return people;
        }
        
        Arrays.sort(people, new Comparator<int[]>(){
          public int compare(int[] a, int[]b){
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
          }
        });
        List<int[]> result = new ArrayList<>();
        for(int[] p: people){
          result.add(p[1], p);
        }
        return result.toArray(new int[people.length][2]);
    }
}
