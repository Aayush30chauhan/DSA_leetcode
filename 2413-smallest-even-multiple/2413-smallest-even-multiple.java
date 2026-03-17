class Solution {
    public int smallestEvenMultiple(int n) {
        int i;
        if(n%2==0){
            return n;
        }
        else{
            i=n*2;
            return i;
        }
    }
}