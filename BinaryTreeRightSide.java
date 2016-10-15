/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(root, result, 1);
        return result;
    }
    
    public void helper(TreeNode n, ArrayList<Integer> result, int level){
        if(n != null){
            if(level > result.size()){
                result.add(n.val);
            }
            helper(n.right, result, level + 1);
            helper(n.left, result, level + 1);
        }
    }
}
