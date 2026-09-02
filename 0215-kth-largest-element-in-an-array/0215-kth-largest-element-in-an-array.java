class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> qu = new PriorityQueue<>();
     
        for(int no : nums){

            qu.add(no) ;

            if(qu.size() >k){
                qu.poll() ;
            }
        }

        return qu.peek() ;

    }
}