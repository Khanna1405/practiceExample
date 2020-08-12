public class TestEncapsulation {
    public static void main(String[] args) {
Encapsulate obj=new Encapsulate();
obj.setAge(27);
obj.setName("Gourav");
obj.setRoll(87);
//displaying value of the variables:
        System.out.println("Name is: "+obj.getName());
        System.out.println(" Roll no is: "+ obj.getRoll());
        System.out.println("Age is: "+ obj.getAge());
    }
}
