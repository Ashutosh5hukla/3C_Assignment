public class c2_RootEqualSumOfChilde {
    class Solution {
        public boolean checkTree(TreeNode root) {
            return root.val==(root.left.val+root.right.val);
        }
    }
}
