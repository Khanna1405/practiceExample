public class oddEven {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)
            if (i==0)
                System.out.println(i+" is even");
            else if(i%2==0)
                System.out.println(i+" is even");
            else if(i%2!=0)
                System.out.println(i+ " is odd");
    }
}

