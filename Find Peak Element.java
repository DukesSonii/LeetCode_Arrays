class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        return findpeak(arr,0,n-1);
    }

    public int findpeak(int arr[], int low, int high ){
        int n=arr.length;
        int mid = low+(high-low)/2;
        if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid])) {
            return mid;
        }

        else if(mid>0 && arr[mid-1] > arr[mid]){
            return findpeak(arr,low, mid-1);
        }
        else{
            return findpeak(arr,mid+1,high);
        }
    }
}
