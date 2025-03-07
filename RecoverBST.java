//Time Complexity : O(n)
//Space Complexity : O(n)

Class Solution {
        TreeNode first, second, prev;
public void recoverTree(TreeNode root) {
        if(root == null){
        return;
        }
        Stack<TreeNode> s = new Stack<>();
        while(root !=null || !s.isEmpty()){
        while(root != null){
        s.push(root);
        root = root.left;
        }
        root = s.pop();
        if(prev !=null && prev.val > root.val){
        if(first == null){
        first = prev;
        }
        second = root;
        }
        prev = root;
        root = root.right;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        }
        }