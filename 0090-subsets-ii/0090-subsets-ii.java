class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        return mycode(list, list1, nums, 0);
    }

    public static List<List<Integer>> mycode(
            List<List<Integer>> list,
            List<Integer> list1,
            int[] nums,
            int index) {

        if (index == nums.length) {
            list.add(new ArrayList<>(list1));
            return list;
        }

        // TAKE
        list1.add(nums[index]);

        mycode(list, list1, nums, index + 1);

        // BACKTRACK
        list1.remove(list1.size() - 1);

        // NOT TAKE
        // Agar next element same hai, duplicate branch skip karo
        int next = index + 1;

        while (next < nums.length &&
               nums[next] == nums[index]) {
            next++;
        }

        mycode(list, list1, nums, next);

        return list;
    }
}