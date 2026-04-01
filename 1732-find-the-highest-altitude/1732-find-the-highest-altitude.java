class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int hieght=0;
        int max=0;
        for(int i=0;i<n;i++){
            hieght+=gain[i];
            if(hieght>max){
                max=hieght;
            }
        }
        return max;
    }
}