package trees;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
       if(root == null) return false;

       if(root.left == null && root.right == null){
           return sum == root.val;
       }
       return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        // Create a sample tree:
        //          5
        //         / \
        //        4   8
        //       /   / \
        //      11  13  4
        //     /  \      \
        //    7    2      1
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        PathSum ps = new PathSum();
        int sum = 22;
        System.out.println("Has path sum " + sum + ": " + ps.hasPathSum(root, sum));  // Output: true
    }
}
