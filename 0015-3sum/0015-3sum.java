class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {

            int left = i + 1;
            int right = nums.length - 1;
            int num = nums[i];

            while (left < right) {

                int sum = num + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(num, nums[left], nums[right]));
                    left++ ;
                    right-- ;

                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }

            }

        }

        return new ArrayList<>(list);
    }
}