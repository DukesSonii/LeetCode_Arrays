class Solution {
    static class Pair implements Comparable<Pair>{
        int val; 
        int idx;
        
        public Pair(int val,int idx){
            this.val = val;
            this.idx=idx;
        }
        
        @Override
        public int compareTo(Pair p2){
            //sort on basis of descending order jiski badi val h vo pehle               jiski  choti h val vo baad me 
            return p2.val - this.val;
        }
    }
    
    
    public int[] maxSlidingWindow(int[] arr, int k) {
        int res[] = new int[arr.length-k+1];
	    
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        //for Ist window pehle ke k elements ko add kia
        for(int i=0; i<k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        
        //1st window se jo max aayi isse res[0] mai store kra lia    
        res[0] = pq.peek().val;
        
        for(int i=k; i<arr.length; i++) {
            while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq. remove();
            }
            
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }
        
        //print result
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
        return res;
    }
}
