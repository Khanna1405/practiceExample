import java.util.Scanner;

public class signOfProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("The sign is +");
        } if (x < 0 && y < 0 && z < 0) {
            System.out.println("The sign is +");
        } else if (x > 0 && y < 0 && z < 0)
        {
            System.out.println("The sign is +");
        }
        else if (x < 0 && y > 0 && z < 0)
        {
            System.out.println("The sign is +");
        }
        else
            {
            System.out.println("The sign is -");
        }
    }
}