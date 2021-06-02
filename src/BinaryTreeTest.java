public class BinaryTreeTest {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

        // Root
        binaryTree.Insert(20);

        // Left
        binaryTree.Insert(15);
        binaryTree.Insert(10);
        binaryTree.Insert(16);

        // Right
        binaryTree.Insert(25);
        binaryTree.Insert(23);
        binaryTree.Insert(22);
        binaryTree.Insert(24);

        // Print
        binaryTree.PrintDFS();

        // Delete
        binaryTree.Delete(25);

        // Print
        binaryTree.PrintDFS();
    }
}
