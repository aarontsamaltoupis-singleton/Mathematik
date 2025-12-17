public class BinarySearchTree {
    public BinarySearchTreeNode root;// root hat am anfang noch keinen wert. Nur die Instanz von root wurde initialisiert, nicht seine Variable number


    public BinarySearchTree(){}

    public void add(final Double number){
        if (root==null){root=new BinarySearchTreeNode();}
        root.add(number); //durch add number wird der wurzel ein wert zugewiesen
    }
    public int getHeight(){
        return root.getHeight();
    }
}
