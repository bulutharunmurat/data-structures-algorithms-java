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
        binarySearchTree.printBF();
        binarySearchTree.printInOrder();
        binarySearchTree.printPreOrder();
        binarySearchTree.printPostOrder();


        Integer data = binarySearchTree.search(19).data;
        System.out.println(data);

        binarySearchTree.remove(20);
        binarySearchTree.remove(13);
        binarySearchTree.remove(24);
        binarySearchTree.remove(17);
        binarySearchTree.remove(23);
        binarySearchTree.printBF();


    }
}
