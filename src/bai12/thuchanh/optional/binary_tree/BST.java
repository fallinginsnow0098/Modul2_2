package bai12.thuchanh.optional.binary_tree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = creatNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current!= null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0){
                parent.left = creatNewNode(e);
            } else {
                parent.right = creatNewNode(e);
            }

        }
        size++;
        return true;
    }
    protected TreeNode<E> creatNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return 0;
    }
    public void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
