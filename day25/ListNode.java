 public class ListNode {
    public Static void main(int i, int n[], List<Integer> subset, List<List<Integer>> result) {
        int n= nums;
        int n = nums.length;
        if(i == n.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(n[i]);
        helper(i + 1, n, subset, result);
        subset.remove(subset.size() - 1);

        while(i + 1 < n.length && n[i] == n[i + 1]) i++;
        helper(i + 1, n, subset, result);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, subset, result);
        return result;
    }
}