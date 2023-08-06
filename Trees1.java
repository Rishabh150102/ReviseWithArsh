

/**
 * Trees1
 */
public class Trees1 {

    int ans = 0;
    public  int heightTree(TreeNode root){
            if(root == null){
                return 0;
            }

            int lh = heightTree(root.left);
            int rh = heightTree(root.right);
            ans = Math.max(ans, lh+rh);
            int height = Math.max(lh, rh) + 1;
            return height;
        }
    public int diameterOfBinaryTree(TreeNode root) {
        heightTree(root);
        return ans;
    }

    public static void main(String[] args) {
        //543. Diameter of Binary Tree

    }
}