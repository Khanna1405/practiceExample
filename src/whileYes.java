import java.util.Scanner;

public class whileYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int input = 0;
        String ans;
        do {
            System.out.println("Please Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Please enter the second number:");
            int b = sc.nextInt();
            System.out.println("sum of two number is:" + (a + b));
            //System.out.println("Enter 1 to continue or please any other number to exit");
           // input = sc.nextInt();
            System.out.println(" To continue enter yes else enter no");
            ans=sc.next();


        }
        //while (input == 1);
        while(ans.equals("Yes"));
    }
}
//there is doubt that when we put lower case yes or upper case yes even then program exit..