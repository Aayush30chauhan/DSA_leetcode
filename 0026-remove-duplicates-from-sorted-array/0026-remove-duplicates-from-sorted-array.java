class Solution {
    public int removeDuplicates(int[] nums) {
        int m=nums.length;
        int i=0;
        for(int j=1;j<m;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}