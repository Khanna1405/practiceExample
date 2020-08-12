public class SummationUsingWhileLoop {
    public static void main(String[] args) {
//summation of number from 1 to 10
        int i=0,sum=0;
        while(i<=100)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(" sum of the number from 1 to 10 is: "+sum);
    }
}
