class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] arr = new int[nums.length] ;

        for(int i = 0 ; i<nums.length ;i++){

             int len = i + k;

             if(len >= nums.length){
                arr[len%nums.length] = nums[i] ;
             }

             else{
                arr[len] = nums[i] ;
             }

        }

for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }    }
}