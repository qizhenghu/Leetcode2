class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pnum = 0;
        int number = 0;
        while(number < buckets){
          pnum++;
          number=Math.pow((minutesToTest/minutesToDie)+1, pnum);          
        }
        return pnum;
    }
}
