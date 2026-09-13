class Solution {
    public int maxVowels(String s, int k) {

      int maxcount = 0 ;
      int count = 0 ;
 
      for(int i = 0 ; i<k ; i++){
        char ch = s.charAt(i) ;

        if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u'){
            count++ ;

            maxcount = Math.max(count , maxcount) ;
        }
      }
 
      int m = 0 ;
      for(int i = k ; i<s.length() ; i++){

        char ch1 = s.charAt(m) ;

        if(ch1 == 'a' || ch1 == 'e' ||  ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ){
             count-- ;
        }

        char ch2 = s.charAt(i) ;
        
        if(ch2 == 'a' || ch2 == 'e' ||  ch2 == 'i' || ch2 == 'o' || ch2 == 'u' ){
             count++ ;
        }

            maxcount = Math.max(count , maxcount) ;
          
          m++ ;
      }


      return maxcount ;  
    }
}