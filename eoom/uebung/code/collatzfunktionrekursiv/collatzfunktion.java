public class collatzfunktion{
    public static void collatz(int n){
        if(n==1){
            System.out.println("1");
        }
        else if(n%2==0){
            System.out.println(n);
            collatz(n/2);
        }
        else{
            System.out.println(n);
            collatz(3*n+1);
        }
    }
}