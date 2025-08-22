package Date_22_aug;

import java.util.ArrayList;

public class c1_CountBSTnodesLiesInRange {
    class Node{
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    class Solution{
        int getCount(Node root,int l, int h){
            ArrayList<Integer> arr=new ArrayList<>();
            inorder(root,arr);
            int count=0;
            for(int i=0;i<arr.size();i++){
                if(l<=arr.get(i) && arr.get(i)<=h) count++;
            }
            return count;
        }
        
        void inorder(Node root,ArrayList<Integer> arr){
            if(root==null) return;
            inorder(root.left,arr);
            arr.add(root.data);
            inorder(root.right,arr);
        }
    }
}
