public class c1_InsertAGivenNodeInBT{
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) { 
        this.val = val; 
        }
    }
 
class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            TreeNode temp=root;
            TreeNode parent=null;
            TreeNode node=new TreeNode(val);

            while(temp!=null){
                parent=temp;
                if(val<temp.val)temp=temp.left;
                else if(val>temp.val)temp=temp.right;
            }

            if (parent == null)return node;
            if(val<parent.val)parent.left=node;
            else parent.right=node;
            return root;
        }
    }
}