class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String> > map = new HashMap<>() ;

        for(int i = 0 ; i<strs.length ; i++){

            String str = strs[i] ;

            char[] arr = str.toCharArray() ;
             Arrays.sort(arr) ;
            String str1 = new String(arr) ;

            List<String> list1 = new ArrayList<>() ;

            if(!map.containsKey(str1)){
                list1.add(str) ;

                map.put(str1 , list1) ;
            }

            else{

                list1 = map.get(str1) ;
                list1.add(str) ;
                 map.put(str1 , list1) ; ;
            }
        }

        List<List<String>> list = new ArrayList<>(map.values()) ;

             
          return list ;
    }
}