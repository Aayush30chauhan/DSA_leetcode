class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
    }
    public void reverse(int []nums,int l,int r){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}