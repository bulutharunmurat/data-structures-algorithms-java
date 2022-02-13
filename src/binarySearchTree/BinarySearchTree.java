package binarySearchTree;

import java.util.Objects;

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }


    public void add(Integer data) {
        TreeNode newNode = new TreeNode(data);

        if (Objects.isNull(root)) {
            root = newNode;
            return;
        } else {
            TreeNode p = root;
            while (true) {
                if (p.data > newNode.data) {
                    if (Objects.isNull(p.left)) {
                        p.left = newNode;
                        return;
                    } else {
                        p = p.left;
                    }
                } else if (p.data < newNode.data) {
                    if (Objects.isNull(p.right)) {
                        p.right = newNode;
                        return;
                    } else {
                        p = p.right;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public TreeNode search(Integer data) {
        TreeNode p = root;
        while (Objects.nonNull(p)){
            if(p.data > data) {
                p = p.left;
            } else if (p.data < data) {
                p = p.right;
            } else {
                return p;
            }
        }
        return null;
    }

    public TreeNode searchParent(Integer data) {
        if (root.data == data) {
            return null;
        }

        TreeNode parent = root;
        TreeNode p = root;
        while (Objects.nonNull(p)){
            if(p.data > data) {
                parent = p;
                p = p.left;
            } else if (p.data < data) {
                parent = p;
                p = p.right;
            } else {
                return parent;
            }
        }
        return null;
    }

    /**
     * rigth node of deleted node would insert to left node's rigthess node (if new root would be left node of deleted  node)
     *
     * @param data
     */
    public TreeNode remove(Integer data) {
        TreeNode parent = searchParent(data);
        TreeNode remNode = search(data);
        TreeNode p = null;

        if (Objects.isNull(remNode)) {
            return null;
        }

        if (Objects.isNull(parent)) {
            root = remNode.left;
            p = root;
        } else {
            if (remNode == parent.left) {
                parent.left = remNode.left;
                p = parent.left;

            } else if (remNode == parent.right) {
                parent.right = remNode.right;
                p = parent.right;
            }
        }

        if (Objects.nonNull(p)) {
            while (Objects.nonNull(p.right)) {
                p = p.right;
            }
            p.right = remNode.right;
        }
        return remNode;

    }
}
