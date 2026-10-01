public class Main {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Only right subtree exists
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // Only left subtree exists
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Both subtrees exist
        return 1 + Math.min(
                minDepth(root.left),
                minDepth(root.right)
        );
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.right = new TreeNode(4);

        int result = minDepth(root);

        System.out.println("Minimum Depth: " + result);
    }
}