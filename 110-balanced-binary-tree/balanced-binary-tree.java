class Solution {
    public boolean isBalanced(TreeNode root) {
        // If the height method returns -1, the tree is unbalanced
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        // Base case: an empty tree has a height of 0
        if (node == null) {
            return 0;
        }

        // 1. Check the height of the left subtree
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // Propagate the unbalance signal up

        // 2. Check the height of the right subtree
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // Propagate the unbalance signal up

        // 3. Check if the current node is unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Return -1 to signal this tree is unbalanced
        }

        // 4. If balanced, return the actual height of this node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
