public class armstrongnumber {
    public static void main(String[] args) {
    three_digit_armstrong_number();
    }
    static void three_digit_armstrong_number(){
        for (int i=1; i<10;++i)
        {
            for (int j=1;j<10; ++j)
            {
                for(int k=1;k<10;++k)
                {
                    int pow= (int)(Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3));
                    int plus= (i*100+j*10+k*1);
                    if (pow==plus)
                        System.out.println(pow);
                }
            }
        }
    }

// why I am not getting remaining 370 and 407 value.



}
