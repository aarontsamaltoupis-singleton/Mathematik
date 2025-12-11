import java.util.TreeMap;
public class BinarySearchTreeNode{
    private BinarySearchTreeNode linkesKind;
    private BinarySearchTreeNode rechtesKind;
    private Double number;

    BinarySearchTreeNode(){}
    public void add(final Double number) {
            if (this.number ==null){
                this.number = number;
            }
            else{
                if (number<this.number){
                    if (this.linkesKind==null){
                        linkesKind = new BinarySearchTreeNode();
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
}

