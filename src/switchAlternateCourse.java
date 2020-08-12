import java.util.Scanner;

public class switchAlternateCourse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter in which year you are:");
        int year=sc.nextInt();
        System.out.println("Please enter your branch name in MMMM format:");
        String Branch=sc.next().toUpperCase();
        switch(year){
            case 1:
                System.out.println("Elective Courses are: Chemistry,Engineering drawing,C++");
                break;
            case 2:
                 switch(Branch){
                    case "MECH":
                        System.out.println("Elective Course are: Machine tools, fluid Machinery,Mechatronics");
                        break;
                    case "CSE":
                        System.out.println("Elective Courses are: Java, SQL Plus, SpringBoot");
                        break;}
            case 3:{
                switch(Branch){
                    case "MECH":
                        System.out.println("Elective Course are: Industrial Engineering,Manufacturing Process,Robotics");
                        break;
                    case "CSE":
                        System.out.println("Elective Course are: Python ");
                        break;
                    default:
                        System.out.println("Elective course are: Workshop");
                }
            }
        }
    }
}

