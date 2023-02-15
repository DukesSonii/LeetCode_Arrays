class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0){
            return 0;
        }
        /*why we are using end cordinate bec we want to see next upcoming balloon overlappes with existing 
        ballon or not 
        if overlap 1 arrow is needed and if not 2 arrows are needed*/
        //sort the array on basis of end cordinate
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]) );
        int arrow=1;
        int reach = points[0][1];    //first balloon that points to fist end cordinate
        for(int i=1; i < points.length; i++){
            //if start pt greater than end there is no overlapping
            if(points[i][0]>reach){
                arrow+=1;
                reach=points[i][1]; //update reach to end terminal of current balloon
            }
                //otherwise skip this balloon bc that can be covered by previous reach
                //and also we"ll not use any new arrow
        }
        return arrow; 
    }
}
