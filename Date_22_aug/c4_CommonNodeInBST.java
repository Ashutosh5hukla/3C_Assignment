package Date_22_aug;

import java.util.ArrayList;
import java.util.HashSet;

public class c4_CommonNodeInBST {

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
    static void inorder1(Node root,HashSet<Integer> m){
        if(root==null){
            return;
        }
        inorder1(root.left,m);
        m.add(root.data);
        inorder1(root.right,m);
    }
    static void inorder2(Node root,HashSet<Integer> m,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder2(root.left,m,arr);
        if(m.contains(root.data)){
            arr.add(root.data);
        }
        inorder2(root.right,m,arr);
    }
	public static ArrayList<Integer> findCommon(Node root1,Node root2){
        HashSet<Integer> m=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        inorder1(root1,m);
        inorder2(root2,m,arr);
	    return arr;
	}
}
}
