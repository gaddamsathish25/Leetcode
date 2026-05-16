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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
         
        if(root.val==key){
            return  connection(root);
        }

        TreeNode temp=root;

        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=connection(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }
            else{

                if(root.right!=null && root.right.val==key){
                    root.right=connection(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }

        return temp;
    }

    public TreeNode connection(TreeNode root){

        if(root.left==null){
            return root.right;
        }
         else if(root.right==null){
            return root.left;
        }
    else{
        TreeNode rightside=root.right;

        TreeNode leftside=leftright(root.left);

        leftside.right=rightside;

        return root.left;

    }

    }
    public TreeNode leftright(TreeNode root){
        if(root.right==null){
            return root;
        }
       return leftright(root.right);
    }

}