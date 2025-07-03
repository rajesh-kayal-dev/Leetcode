class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

  private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));  // add current subset
    for (int i = index; i < nums.length; i++) {
        current.add(nums[i]);              // choose element
        backtrack(i + 1, nums, current, result); // explore further
        current.remove(current.size() - 1); // backtrack
    }
}

}