347. Top K Frequent Elements

S.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(k == nums.length){
            return nums;
        }

        Map<Integer , Integer> maps = new HashMap<>();
        for(int n : nums){
            maps.put(n , maps.getOrDefault(n , 0 )+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b)-> maps.get(a) - maps.get(b)
        );

        for(int n : maps.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i = 0 ; i <k ;i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
}
