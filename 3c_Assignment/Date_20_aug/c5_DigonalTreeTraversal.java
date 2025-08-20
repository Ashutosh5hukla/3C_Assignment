import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class c5_DigonalTreeTraversal {
    class Tree {
     public ArrayList<Integer> diagonal(Node root){
           //add your code here.
           ArrayList<Integer> ans= new ArrayList<>();
           if(root==null)return null;
           Queue<Node> q= new LinkedList<>();
           q.add(root);
           while(!q.isEmpty()){
               Node curr=q.remove();
               while(curr!=null){
                   ans.add(curr.data);
                   if(curr.left!=null)q.add(curr.left);
                   curr=curr.right;
               }
           }
           return ans;
      }
}
}
