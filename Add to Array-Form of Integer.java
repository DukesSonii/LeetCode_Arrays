class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        for(int i=n-1;i>=0;i--){
            num[i]=num[i] + k%10 + carry;   //see test case 1:  34 % 10 = 4 and for test custom case 2: 7
                                                                                    //+ 4 = 11
            list.add(num[i] % 10);  //so 7+4 = 11 we need to add only 1 so %10 and 1 will be carry
            carry = num[i] / 10;
            k = k/10;   //now 4 will be eliminated
        } 

        //this is for case num[2,1,5] + 806 
        k = k+carry;
        while(k!=0){
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}

/*num[] = [1, 2, 0, 0]      result: list = [4, 3, 2, 1]
this case has no carry

        1   2   0   0
        +       3   4
        ______________
        1    2   3   4

carry case
                1.
        1   2   0   7
        +       3   4
        ______________
        1    2   4   1

*/
