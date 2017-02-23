/**
 * Created by Ray on 2017/2/21.
 */
public class Tree {
    BinaryTreeNode root;

    public class BinaryTreeNode{
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        private int info;

        public BinaryTreeNode(int info) {
            this.info = info;
            left = null;
            right = null;
        }
    }

    public void initTree(){
        root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(33);
        root.left.left = new BinaryTreeNode(44);
        root.left.right = null;
    }
    /*

    1
   /\
  2  33
 / \
44 null

    * */

    public void inOrder(BinaryTreeNode tree){
        if (tree != null){
            System.out.print(tree.info);
            inOrder(tree.left);
            inOrder(tree.right);
        }
    }

    public void leftOrder(BinaryTreeNode tree){
        if(tree != null){
            leftOrder(tree.left);
            System.out.print(tree.info);
            leftOrder(tree.right);
        }
    }

    public void rightOrder(BinaryTreeNode tree){
        if(tree != null){
            rightOrder(tree.left);
            rightOrder(tree.right);
            System.out.print(tree.info);
        }
    }

    public BinaryTreeNode getRoot(){
        return root;
    }

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.initTree();
        tree.rightOrder(tree.getRoot());
    }


}
