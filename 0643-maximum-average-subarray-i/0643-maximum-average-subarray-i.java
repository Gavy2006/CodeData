class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0 ;

        for(int i = 0 ; i<k ; i++){
          sum = sum + nums[i] ;
        }

        double avg = sum/k ;
        int m = 0 ;

        for(int i = k ; i < nums.length ; i++){
            

            sum = sum + nums[i] - nums[m] ;
            avg = Math.max(avg , sum/k ) ;
            m++ ;
        }


        return avg ;
    }
}