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

}
