public class TestBinarySearchTree {
    public static void main (String[] args){
        BinarySearchTree tree1 =new BinarySearchTree();
        tree1.add(50.0);
        tree1.add(25.0);
        tree1.add(75.0);
        tree1.add(12.5);
        tree1.add(87.5);
        tree1.add(37.5);
        tree1.add(62.5);
        System.out.println(tree1.getHeight());
        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.add(12.5);
        tree2.add(25.0);
        tree2.add(37.5);
        tree2.add(50.0);
        tree2.add(62.5);
        tree2.add(75.0);
        tree2.add(87.5);
        System.out.println(tree2.getHeight());
    }
}
