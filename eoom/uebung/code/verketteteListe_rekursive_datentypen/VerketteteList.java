public class VerketteteList {
    private Knoten head;


    //Methode, um 
    public void addFirst(int wert){
        Knoten n = new Knoten(wert);
        n.naechsterKnoten = head;// Neuer Knoten verweist auf aktuellen head. 
        // Der erste Knoten verweist demnach auf einen Koten,
        //  der noch nicht initialisiert wurde, 
        // also den WErt null hat.
        head = n; //Der neue head ist dann der aktuelle knoten
    }
    
}
