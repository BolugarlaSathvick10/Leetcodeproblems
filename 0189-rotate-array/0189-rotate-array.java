class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % nums.length;
            nums1[index] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums1[i];
        }
    }
}