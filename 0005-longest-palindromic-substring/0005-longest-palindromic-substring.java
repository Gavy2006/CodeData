class Solution {
    public String longestPalindrome(String s) {

        if (s.length() <= 1)
            return s;

        int max = 1;
        String maxstr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {

            // yaad se odd case hai ye apna 
            int low = i-1 ;
            int high = i+1 ;

             while(low >= 0 && high< s.length()){
                  
                  if(s.charAt(low) == s.charAt(high)){
                    low-- ;
                    high++ ;
                  }

                  else{
                    break ;
                  }
             }

             if( (high - low - 1) > max){
               
               maxstr = s.substring(low+1 , high) ;
               max  = high - low - 1 ;
             }


              // even se even case hai ye apna 
             low = i ;
             high = i+1 ;

             while(low >= 0 && high< s.length()){
                  
                  if(s.charAt(low) == s.charAt(high)){
                    low-- ;
                    high++ ;
                  }

                  else{
                    break ;
                  }
             }

             if( (high - low - 1) > max){
               
               maxstr = s.substring(low+1 , high) ;
               max  = high - low - 1 ;
             }
        }

        return maxstr ;
    }
}