class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
         
         for(int i = 0 ; i<stones.length ; i++){
            pq.offer(stones[i]) ;
         }


        while(pq.size() > 1){

            int no = pq.poll() ;

            if(no ==  pq.peek()){
                pq.poll() ;
            }

            else{
                int n = no - pq.poll() ;
                pq.offer(n) ;
            }
        }


        return pq.size() == 1 ? pq.peek() : 0 ;
    }
}