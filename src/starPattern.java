public class starPattern {
    public static void main(String[] args) {
        int x,y;
        String chr=null;
        for(x=1;x<=6;x++)
        {
            for( y=1;y<x;y++)
            {
                chr=chr+("*");
            }
            System.out.println(chr);
            chr="";
        }
    }
}

