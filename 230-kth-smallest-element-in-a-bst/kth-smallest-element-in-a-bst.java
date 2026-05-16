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
    public int kthSmallest(TreeNode root, int k) {
       int count[]=new int[1];

       return inorder(root,k,count);

    }

    public int inorder(TreeNode root,int k,int count[]){
        if(root==null) return -1;

        int left=inorder(root.left,k,count);

        if(left!=-1) return left;

        count[0]++;

        if(count[0]==k) return root.val;

        return inorder(root.right,k,count);
    }
}