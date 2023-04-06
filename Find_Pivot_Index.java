class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;
        for(int i=0;i<n;i++){
            totalSum = totalSum + nums[i];
        }
        for(int i=0;i<n;leftSum+=nums[i++]){
            if(2*leftSum == totalSum - nums[i]){
                return i;
            }
        }
        return -1;
    }
}
