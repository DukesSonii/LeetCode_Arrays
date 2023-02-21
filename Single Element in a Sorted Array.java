class Solution {
    public int singleNonDuplicate(int[] nums) {
        int si=0, ei = nums.length-1;
        while(si<ei){
            int mid = (si+ei)/2;
            if(mid%2 == 0 && nums[mid] == nums[mid+1] || mid%2 == 1 && nums[mid] == nums[mid-1]){
                si=mid+1;
            }
            else 
                ei=mid;
        }
        return nums[si];
    }
}
