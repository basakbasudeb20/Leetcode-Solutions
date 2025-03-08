Q. 1. Two Sum

S.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        Map<Integer, Integer> maps = new HashMap<>();

        for(int i = 0 ; i <nums.length ; i++){
            int rem = target - nums[i];

            if(maps.containsKey(rem)){
                arr[0] = maps.get(rem) ;
                arr[1] = i;
            }
            maps.put(nums[i] , i);
        }
        return arr;
        
    }
}
