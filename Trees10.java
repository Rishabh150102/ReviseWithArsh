import javax.swing.tree.TreeNode;

/**
 * Trees10
 */
public class Trees10 {

    //https://www.youtube.com/watch?v=5qj18l76xy4
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base cases
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        //100. Same Tree

    }
}