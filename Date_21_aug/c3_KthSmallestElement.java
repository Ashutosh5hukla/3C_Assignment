import java.util.ArrayList;
import java.util.List;

public class c3_KthSmallestElement {
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    class Solution {
        public void inorder(TreeNode root, List<Integer> ans){
            if(root == null){
                return;
            }
            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right, ans);
        }
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> ans = new ArrayList<>();

            inorder(root, ans);

            return ans.get(k - 1);
        }
    }

}
