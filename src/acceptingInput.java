
import java.util.Scanner;

public class acceptingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your name:");
        String name = sc.nextLine();
        System.out.println("Hi: "+name);
        System.out.println("Please Entered your age:");
        int a=sc.nextInt();
        System.out.println(name+" : You are " +a+ " years old ");
    }
}