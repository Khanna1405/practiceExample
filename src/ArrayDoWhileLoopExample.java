public class ArrayDoWhileLoopExample {
    public static void main(String[] args) {
        int a[]={23,34,2,56,7};
        int i=0;
        do{
            System.out.println(a[i]);
            i++;

        } while(i<a.length);
    }
}
// for same problem we can use for loop as well
/*for (int num: a)
        {
            System.out.println(num)
        }


 */