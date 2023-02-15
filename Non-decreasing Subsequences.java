class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return new ArrayList<>(res);
    }
    
    private void dfs(int[] nums, int start, List<Integer> curr, Set<List<Integer>> res) {
        if (curr.size() >= 2) {
            res.add(new ArrayList<>(curr));
        }
        
        for (int i = start; i < nums.length; i++) {
            if (curr.size() == 0 || curr.get(curr.size() - 1) <= nums[i]) {
                curr.add(nums[i]);
                dfs(nums, i + 1, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
