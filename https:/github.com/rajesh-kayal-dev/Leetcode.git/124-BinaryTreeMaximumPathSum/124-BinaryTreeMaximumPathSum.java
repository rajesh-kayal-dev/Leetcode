// Last updated: 6/15/2026, 10:02:13 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode node){
        if(node == null) return 0;

        int leftMax = Math.max(helper(node.left), 0);
        int rightMax = Math.max(helper(node.right), 0);

        int currMax = node.val + leftMax + rightMax;

        maxSum = Math.max(maxSum, currMax);

        return node.val + Math.max(leftMax, rightMax);
    }
}