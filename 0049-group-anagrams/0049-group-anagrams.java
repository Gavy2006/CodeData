class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String>> map = new HashMap<>() ;
        
        
        for(int i = 0 ; i<strs.length ; i++){
          
          List<String> list1 = new ArrayList<>() ;

          String str = strs[i] ;
          char[] arr = str.toCharArray() ;
          Arrays.sort(arr) ;
          str = new String(arr) ;

          if(map.containsKey(str)){

             list1 = map.get(str) ;
             list1.add(strs[i]) ;
             map.put(str , list1) ;
          }

          else{
                list1.add(strs[i]) ;
             map.put(str , list1) ;
          }
        }

          List<List<String>> list = new ArrayList<>(map.values()) ;

        return list ;
    }
}