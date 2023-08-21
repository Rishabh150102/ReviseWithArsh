import javax.swing.tree.TreeNode;

/**
 * Trees8
 */
public class Trees8 {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=1+maxDepth(root.left);
        int right=1+maxDepth(root.right);
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        //104. Maximum Depth of Binary Tree

    }
}