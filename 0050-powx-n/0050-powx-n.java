class Solution {
    public double myPow(double x, int n) {
        
         long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

       return mycode(x ,    N) ;
    }

    public double mycode(double x, long n){

        if(n == 0) return 1 ;

      else  if(n == 1){
            return x * mycode(x , n-1) ;
        }


       else if(n%2 == 0){
            x = x*x ;
            n = n/2 ;
            return mycode(x , n) ;
        }

       else{

        return  x * mycode(x ,n-1) ;
       }

    }
}