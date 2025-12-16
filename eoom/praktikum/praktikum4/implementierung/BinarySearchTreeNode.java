public class BinarySearchTreeNode{
    private BinarySearchTreeNode linkesKind; //jede node hat andere nodes als Kinder
    private BinarySearchTreeNode rechtesKind;
    private Double number;//der wert der TreeNode

    BinarySearchTreeNode(){}
    public void add(final Double number) {
            if (this.number ==null){//wenn zahl im aktuellen knoten noch keinen wert hat
                this.number = number;//, so setze sie auf die einzufuegende Zahl
            }
            else{
                if (number<this.number){// wenn einzusetzender wert kleiner als Wert des aktuellen Knotens, schaue ob neuer wert groesser oder kleiner als wert
                    if (this.linkesKind==null){ 
                        linkesKind = new BinarySearchTreeNode(); //lege linkes kind an, wenn noetig
                    }
                    linkesKind.add(number);
                if (number<this.number){
                    if (this.rechtesKind==null){
                        rechtesKind = new BinarySearchTreeNode();
                    }
                    rechtesKind.add(number);
                }
            }
        }
    }
    public int getHeight(){
        if (linkesKind == null& rechtesKind == null){
            return 0;//wenn  beide Kinder nicht existieren ist die Hoehe null. 
        }
        else{
            if (linkesKind==null){return rechtesKind.getHeight();}
            else if (rechtesKind==null){return linkesKind.getHeight();}
            else if(linkesKind.getHeight()<rechtesKind.getHeight()){ //grundsaetzich sollen einfach die laengste hoehe der beiden Kinder ausgewaehlt 
                //werden, es muss aber der fall betrachtet werden, wenn eines der beiden Kinder nciht existsiert. 
                return rechtesKind.getHeight()+1;}
                else{
                    return linkesKind.getHeight()+1;
                }
            }
        }
}