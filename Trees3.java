import javax.swing.tree.TreeNode;

/**
 * Trees3
 */
public class Trees3 {

    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        //572. Subtree of Another Tree

    }
}