class Solution {
    public void sortColors(int[] nums) {
        
        int i=0;
        int j=0; 
        int count = 0;
        
        while(j < nums.length){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                count++;
            }
            j++;
        }
        i = count; j = count;

         while(j < nums.length){
            if(nums[j] == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}