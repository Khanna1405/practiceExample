import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int a=sc.nextInt();
        int Fact=1,i=1;
        while(a>=i){
            Fact=Fact*i;
            i++;
        }
        System.out.println("Factorial of the number is:"+Fact);
    }
}
