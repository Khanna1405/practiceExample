import java.util.Scanner;

public class sortthreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the numbers to sort :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z)
        { if (y>z)
            System.out.println(x+","+y+","+z);
            else
                System.out.println(x+","+z+","+y);}
        else if (y>x && y>z) {
            if (x > z)
                System.out.println(y + "," + x + "," + z);
            else
                System.out.println(y + "," + z + "," + x);
        }
        else if (z>x && z>y)
        {
            if(x>y)
                System.out.println(z+","+x+","+y);
            else
                System.out.println(z+","+y+","+x);
        }
    }
}
