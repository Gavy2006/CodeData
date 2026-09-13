class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase() ;

       s =  s.replaceAll("[^a-z0-9]" , "") ;

       int j = 0 ;
       int k = s.length() -1 ;

       for(int i = 0 ; i<s.length()/2 ; i++){
 
       if(s.charAt(j) != s.charAt(k)) return false ;

       else{
        j++ ;
        k-- ;
       }
           
       }

         return true ;
    }
}