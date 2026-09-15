class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int i = nums.length - 1;
        int[] arr = new int[nums.length];
        Arrays.fill(arr , -1) ;

        while (i >= 0) {

            int no = nums[i];

            for (int j = i + 1; j < i + nums.length; j++) {
                
                 if(nums[j % nums.length] > nums[i]){
                    arr[i] = nums[j % nums.length] ;
                    break ;
                 }

            }

            i-- ;

        }

        return arr;
    }
}