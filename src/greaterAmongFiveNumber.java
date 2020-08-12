public class greaterAmongFiveNumber {
    public static void main(String[] args) {
        int a=-5,b=-2,c=-6,d=0,e=-1;
        if (a>b && a>c && a>d && a>e)
            System.out.println(" the largest number is:"+a);
        else if (b>a && b>c && b>d && b>e)
            System.out.println("The largest number is:"+b);
        else if (c>a && c>b && c>d && c>e)
            System.out.println(" the largest number is:"+c);
        else if (d>a && d>b && d>c && d>e)
            System.out.println(" the largest number is:"+d);
        else
            System.out.println("the largest number is:"+e);
    }
}
