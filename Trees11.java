import javax.swing.tree.TreeNode;

/**
 * Trees11
 */
public class Trees11 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        //235. Lowest Common Ancestor of a Binary Search Tree
    }
}