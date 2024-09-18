public class TriangularBinaryTree {

    // Node class for the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root of the binary tree
    private Node root;

    // Method to create a triangular binary tree
    public void createTriangularTree(int levels) {
        root = createLevel(1, levels);
    }

    // Helper method to create tree level by level
    private Node createLevel(int currentLevel, int maxLevels) {
        if (currentLevel > maxLevels) {
            return null;
        }

        Node node = new Node(currentLevel); // Create a node with level as data
        node.left = createLevel(currentLevel + 1, maxLevels);
        node.right = createLevel(currentLevel + 1, maxLevels);
        return node;
    }

    // Method to print the binary tree in triangular shape
    public void printTree() {
        printTree(root, 0);
    }

    // Helper method to print the tree with indentation
    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        // Print right subtree first
        printTree(node.right, level + 1);

        // Print current node with indentation
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // Indentation for the triangular shape
        }
        System.out.println(node.data);

        // Print left subtree
        printTree(node.left, level + 1);
    }

    // Main method to test the tree creation and display
    public static void main(String[] args) {
        TriangularBinaryTree tree = new TriangularBinaryTree();
        int levels = 3; // You can change the number of levels here
        tree.createTriangularTree(levels);

        System.out.println("Triangular Binary Tree:");
        tree.printTree();
    }
}
