class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        if(s.isEmpty()) return 0 ;
        
        int max = Integer.MIN_VALUE ;

        HashMap<Character , Integer> map = new HashMap<>() ;

      int i = 0 ;
      int j = 0 ;

        while(j < s.length()){

            char ch = s.charAt(j) ;

            if(map.containsKey(ch)){

                while(map.containsKey(ch)){

                    map.put(s.charAt(i) , map.get(s.charAt(i)) -1) ;

                    if(map.get(s.charAt(i)) == 0){ 
                        map.remove(s.charAt(i)) ;
                        } 

                    i++ ;

                }

                 map.put(s.charAt(j) , 1) ;
            }


            else{
                 map.put(s.charAt(j) , 1) ;
            }

            max = Math.max(max , j-i+1) ;
            j++;
        }


        return max ;
    }
}