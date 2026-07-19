class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>() ;
        StringBuilder str = new StringBuilder() ;

        for(int i = 0 ; i<s.length() ;i++){  
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i)  , 0) + 1);
            
        }

       List<Character> list = new ArrayList<>(map.keySet());

       Collections.sort(list , (a , b) -> map.get(b) - map.get(a)) ;

       for(char ch : list){

        int freq = map.get(ch) ;

        while(freq !=0){
            str.append(ch) ;
            freq-- ;
        }
       }


        return str.toString() ;
    }
}