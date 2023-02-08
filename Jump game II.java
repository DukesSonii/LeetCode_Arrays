class Solution {
    public int jump(int[] nums) {
       int jumps = 0;
        int curr = 0;
        int farthest = 0;
        
        for(int i=0; i<nums.length-1; i++){
            farthest = Math.max(farthest, nums[i]+i);    //value +idx value
            if(i==curr){
                curr = farthest;
                jumps++;
            }
        }
        return jumps; 
    }
}
