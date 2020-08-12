import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("Hi, Welcome to the SBI Bank. Please enter your name.");
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Hi, "+name);

        System.out.println("what is your account number?");
        int accNo= sc.nextInt();
        System.out.println("Your Account no. is :"+ accNo);


        System.out.println("which type of account you have?");
        String accName= sc.next();
        System.out.println("Ok, You have " + accName+" account in SBI.");

        System.out.println("what amount currently you have in your account?");
        int amt = sc.nextInt();
        System.out.println(" You have " + amt + " rupees in  your account.");

        System.out.println("How much interest rate you are getting from the bank?");
        double rate= sc.nextDouble();
        System.out.println(" You are getting "+ rate + " % interest from the bank");

        System.out.println("for how much year are expecting to keep this balance?");
        int year= (int)sc.nextInt();
        System.out.println("You are keeping this amount for "+ year+ " year");
        //Balance after five year
        int newBalance =(int)( amt + amt * ((rate*year)/100));
        //int newBalance =  ((int) amt*(Math.pow((1+rate/100),year)));
        System.out.println(" you will get "+ newBalance + " rupees after " +  year +" year . Thanks for coming.");




    }

}
