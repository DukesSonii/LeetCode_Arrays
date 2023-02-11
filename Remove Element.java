class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                    continue;
                } else {
                    nums[i] = nums[j];
                    count++;
                    j--;
                }
            } else {
                count++;
            }
            i++;
        }
        return count;
    }
}
