public class multiple {
    public static void main(String[] args) {
        // sum of multiple of 3 and 5 under 1000
        int sum=0;
        for(int i=0;i<1000;i++)
            if (i%3==0 || i%5==0)
            {
                sum+=i;

            }
            System.out.println(" sum of multiple is:"+sum);


    }
}
