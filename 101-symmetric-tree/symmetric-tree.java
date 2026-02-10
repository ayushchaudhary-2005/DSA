class Solution {

    public boolean find(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return find(root1.left, root2.right) &&
               find(root1.right, root2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return find(root.left, root.right);
    }
}
