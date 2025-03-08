Q. 217. Contains Duplicate 

S.
class Solution {
    public boolean containsDuplicate(int[] nums) { // 1,2,3,1

    Set<Integer> sets = new HashSet<>();

    for(int i : nums){
        if(sets.contains(i)){
            return true;
        }
        sets.add(i);
    }
    return false;

    }
}
