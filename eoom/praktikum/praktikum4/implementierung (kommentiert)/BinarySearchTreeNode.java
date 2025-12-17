public class BinarySearchTreeNode{
    private BinarySearchTreeNode linkesKind; //jede node hat andere nodes als Kinder
    private BinarySearchTreeNode rechtesKind;
    private Double wert;//der wert der TreeNode

    BinarySearchTreeNode(){}
    public void add(final Double wert) {
            if (this.wert ==null){//wenn zahl im aktuellen knoten noch keinen wert hat
                this.wert = wert;//, so setze sie auf die einzufuegende Zahl
            }
            else if (wert<this.wert){// wenn einzusetzender wert kleiner als Wert des aktuellen Knotens, schaue ob neuer wert groesser oder kleiner als wert
                    if (linkesKind==null){ 
                        linkesKind = new BinarySearchTreeNode(); //lege linkes kind an, wenn noetig
                    }
                    linkesKind.add(wert);}
            else if (wert>this.wert){
                    if (rechtesKind==null){
                        rechtesKind = new BinarySearchTreeNode();
                    }
                    rechtesKind.add(wert);
                }
            }
    public int getHeight(){
        if (linkesKind == null&& rechtesKind == null){
            return 1;//wenn  beide Kinder nicht existieren ist die Hoehe null. 
        }
        else{
            if (linkesKind==null){
                return rechtesKind.getHeight()+1;
            }
            else if (rechtesKind==null){
                return linkesKind.getHeight()+1;
            }
            else if(linkesKind.getHeight()<rechtesKind.getHeight()){ //grundsaetzich sollen einfach die laengste hoehe der beiden Kinder ausgewaehlt 
                //werden, es muss aber der fall betrachtet werden, wenn eines der beiden Kinder nciht existsiert. 
                return rechtesKind.getHeight()+1;
            }
            else{
                    return linkesKind.getHeight()+1;
                }
            }
        }
}