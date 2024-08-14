//package trees;
//
//public class SuccessorOfNode {
//    // level order in a list of list
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>> result = new ArrayList();
//        if(root == null) return result;
//        Queue<TreeNode> nodes = new LinkedList();
//        nodes.offer(root);
//        while(!nodes.isEmpty()){
//            List<Integer> internal = new ArrayList();
//            int size = nodes.size();
//            for(int i=0;i<size;i++){
//                TreeNode curr = nodes.poll();
//                internal.add(curr.val);
//                if(curr.left != null) nodes.offer(curr.left);
//
//                if(curr.right != null) nodes.offer(curr.right);
//            }
//            result.add(internal);
//
//        }
//        return result;
//    }
//    public TreeNode successorOfNode(TreeNode root,int key) {
//        if(root == null) return null;
//        Queue<TreeNode> nodes = new LinkedList();
//        nodes.offer(root);
//        while(!nodes.isEmpty()){
//            int size = nodes.size();
//            for(int i=0;i<size;i++) {
//
//                TreeNode curr = nodes.poll();
//                if (curr.left != null) nodes.offer(curr.left);
//                if (curr.right != null) nodes.offer(curr.right);
//
//                if (curr.val == key) break;
//            }
//
//        }
//        return nodes.poll();
//    }
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//        List<List<Integer>> result = new ArrayList();
//        if(root == null) return result;
//        Queue<TreeNode> nodes = new LinkedList();
//        nodes.offer(root);
//        int l=1;
//        while(!nodes.isEmpty()){
//            List<Integer> internal = new ArrayList();
//            int size = nodes.size();
//            for(int i=0;i<size;i++){
//                TreeNode curr = nodes.poll();
//                internal.add(curr.val);
//                if(curr.left != null) nodes.offer(curr.left);
//
//                if(curr.right != null) nodes.offer(curr.right);
//            }
//            l = l==1?0:1;
//            if(l == 1) reverse(internal);
//            result.add(internal);
//
//        }
//        return result;
//    }
//    public void reverse(List<Integer> result){
//        int i=0 , j =result.size()-1;
//
//        while(i < j){
//            int tenp = result.get(i);
//            result.set(i,result.get(j));
//            result.set(j,tenp);
//            i++;
//            j--;
//        }
//    }
//}
