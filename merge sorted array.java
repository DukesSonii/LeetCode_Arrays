class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int p1=m-1; 
        int p2=n-1; 
        int i = m+n-1;
        while(p2>=0){
            if(p1 >= 0 && n1[p1] > n2[p2]){
                n1[i--] = n1[p1--];
            } else{
                n1[i--]=n2[p2--];
            }
        }
    }
}
