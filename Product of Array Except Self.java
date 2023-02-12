class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int leftProd[] = new int[length];
        int rightProd[] = new int[length];
        
        leftProd[0] = 1;
        for(int i=1;i<length;i++){  //for 3 it woulld be 2 * 1 
            leftProd[i]=leftProd[i-1]*nums[i-1];    
        }
        
        rightProd[length-1]=1;
        for(int i=length-1;i>=1;i--){   //for 3 rightprod will be start from 3 which is 1*
            rightProd[i-1] = rightProd[i]*nums[i];
        }
        
        for(int i=0;i<length;i++){
            nums[i] = leftProd[i]*rightProd[i];
        }
        
        return nums;
    }
}
