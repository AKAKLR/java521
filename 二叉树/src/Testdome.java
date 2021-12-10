public class Testdome {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree=new TestBinaryTree();
        Node root=testBinaryTree.creatTree();
        testBinaryTree.preOrderTraversal(root);
        System.out.println();
        testBinaryTree.inOrderTraversal(root);
        System.out.println();
        testBinaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("节点个数");
        testBinaryTree.getSize1(root);
        System.out.println(TestBinaryTree.size);
    }
}
