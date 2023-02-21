class Solution {
    public int search(int[] arr, int tar) {
        int si = 0;
        int ei = arr.length - 1;
       
        while(si<=ei){
            //kaam
            int mid = si+(ei-si)/2;
        
            //mid found
            if(arr[mid]==tar){
                return mid;
            }
         
            //mid on l1
            if(arr[si] <= arr[mid])
            {
                //case a: left
                if(arr[si] <= tar  && tar <= arr[mid]){
                    ei = mid-1;
                } else{
                    //case b: right
                    si = mid+1;
                }
            } 
            else
            {
                //case c:right 
                if(arr[mid] <= tar && tar <= arr[ei]){
                    si = mid+1;
                }else
                    {
                        //case d:left
                        ei = mid-1;
                    }
            }     
        }
        return -1;
    }
}
        
