// Last updated: 7/26/2026, 11:19:21 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private static int maxSum;
18	public static int maxPathSum(TreeNode root) {
19		maxSum= Integer.MIN_VALUE;
20		solve(root);
21		return maxSum;
22	}
23	private static int solve(TreeNode root){
24		if(root == null) return 0;
25		int leftPath = solve(root.left);
26		int rightPath = solve(root.right);
27		//case1:
28		int totalPath = leftPath + rightPath + root.val;
29		//case2:
30		int maxPath = Math.max(leftPath , rightPath) + root.val;
31		//case3:
32		int rootVal = root.val;
33
34		//max of cases
35		maxSum = Math.max(maxSum, 
36		Math.max(totalPath, Math.max(maxPath, rootVal)));
37		//return case2 and case3
38		return Math.max(maxPath, rootVal);
39	}
40}