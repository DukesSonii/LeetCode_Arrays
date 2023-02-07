class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  //sort as binary search wont occur for unsorted arr
        int Diff = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
        int start = i+1;
        int end = nums.length-1;
            while (start < end) {
            int currSum = nums[i]+nums[start]+nums[end];
            if (Math.abs(target - currSum) < Math.abs(Diff)) {
                Diff = target - currSum;
            }
            if (currSum < target) {
                start++;
            } else {
                end--;
            }
        }
    }
    return target - Diff;
  }
}

