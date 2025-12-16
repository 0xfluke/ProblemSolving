class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sums = 0;
        int [] output;
        for(int i = 0 ; i < nums.size() ; i++){
            sums += nums.get(i);
            if(nums.contains(target - nums.get(0))){
                output.add(nums.get(0), nums.get(target - nums.get(0)));
            }
        }
    }
}
