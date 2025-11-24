class Robots{
    private int birthdate;
    private String name;

    public Robots(int birthdate, String name, String subject){
        this.birthdate=birthdate;
        this.name = name;
    }

    public int age() {
        return 2025-birthdate;
    }
    public void say(int subject) {
    }

}



class HelloApp{
    public static void main(String[] args){
        Robots r1=new Robots(2006, "tom", "hi");
        System.out.println(r1.age());
    }
}