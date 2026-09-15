class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>() ;
        int[] arr = new int[k] ;

        for(int i = 0 ; i<nums.length ; i++){

          int no = nums[i] ;
          map.put(no , map.getOrDefault(no , 0) +1) ;
    }

    List<Map.Entry<Integer , Integer>> list = new ArrayList<>(map.entrySet()) ;

    Collections.sort(list , (a , b) -> b.getValue() - a.getValue()) ;

           for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }

        return arr ;
} }