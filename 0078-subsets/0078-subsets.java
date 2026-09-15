class Solution {
    public List<List<Integer>> subsets(int[] nums) {

List<List<Integer>> ans = new ArrayList<>();
List<Integer> list = new ArrayList<>();

        return mycode(ans, list, nums, 0);
    }

    public static List<List<Integer>> mycode(List<List<Integer>> list, List<Integer> list1, int[] nums, int index) {

        if (index == nums.length) {
         
         list.add(new ArrayList<>(list1)) ;

         return list ;
        }

        list1.add(nums[index]);

        mycode(list, list1, nums, index + 1);
              

        list1.remove(list1.size() -1) ;

        mycode(list, list1, nums, index+1);


       return list ;
    }
}