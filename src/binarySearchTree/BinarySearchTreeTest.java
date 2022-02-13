package binarySearchTree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(20);
        binarySearchTree.add(15);
        binarySearchTree.add(25);
        binarySearchTree.add(13);
        binarySearchTree.add(17);
        binarySearchTree.add(23);
        binarySearchTree.add(10);
        binarySearchTree.add(14);
        binarySearchTree.add(19);
        binarySearchTree.add(22);
        binarySearchTree.add(24);
        binarySearchTree.add(20);

        Integer data = binarySearchTree.search(19).data;
        System.out.println(data);
    }
}
