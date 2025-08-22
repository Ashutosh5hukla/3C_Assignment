package Date_22_aug;

public class c2_CountPairs {
    class Solution{
    static int count =0;
    public static boolean checker(Node root2,int x){
        if(root2==null) return false;
        if(root2.data==x) return true;
        if(x<root2.data){
            return checker(root2.left,x);
        }
        if(x>root2.data){
            return checker(root2.right,x);
        }
        return false;
    }
    public static void helper(Node root1, Node root2, int x){
        if(root1==null) return;
        helper(root1.left,root2,x);
        if(checker(root2,x-root1.data)) count++;
        helper(root1.right,root2,x);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        // Code here
        count =0;
        helper(root1,root2,x);
        return count;
    }
}


}
