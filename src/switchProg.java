public class switchProg {
    public static void main(String[] args) {
        int x = 4;
        switch (x) {
            case 1:
            case 2:
            case 3:
                System.out.println("Hello");
                break;
            case 4:
                System.out.println("Hi Gourav");

            case 5:
            case 6:
                System.out.println("Hi");
                break;
        }
        System.out.println("Outside switch");
    }
}
