import java.util.Scanner;

public class Sum {
    //solveMeFirst method is introduced
    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter first number:");
        a = in.nextInt();
        int b;
        System.out.println("Enter second number:");
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("sum of two number is:"+sum);

    }
}
