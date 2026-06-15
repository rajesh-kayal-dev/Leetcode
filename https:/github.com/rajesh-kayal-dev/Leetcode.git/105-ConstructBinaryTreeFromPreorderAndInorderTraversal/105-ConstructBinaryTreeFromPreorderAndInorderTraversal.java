// Last updated: 6/15/2026, 10:02:22 AM
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
    int preIndex = 0;
    Map<Integer, Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i = 0; i <inorder.length;i++){
            inMap.put(inorder[i], i);
        }

           return build(preorder,0,inorder.length -1 );
    }

    private TreeNode build(int[] preorder, int start,int end){

        if(start > end) return null;

        int rootVal = preorder[preIndex++];

        TreeNode root = new TreeNode(rootVal);

        int index = inMap.get(rootVal);

        root.left = build(preorder,start,index - 1);
        root.right = build(preorder,index + 1,end);

        return root;

    }
}