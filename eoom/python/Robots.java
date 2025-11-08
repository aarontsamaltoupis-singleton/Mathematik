


public class Robots{
    private String name;
    private int birthdate; 

    public Robots(String name,int birthdate){
        this.birthdate=birthdate;
        this.name=name;
    }
    public int age(){
        return 2025-birthdate;
    }
}


public static void main(String[] args) {
   Robots r1 = new Robots("tom",2006);
   System.out.println(r1.birthdate);
   System.out.println(r1.age()); 
}