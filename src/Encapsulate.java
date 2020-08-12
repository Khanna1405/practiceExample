public class Encapsulate {
    private String Name;
    private int age;
    private int Roll;
    //get method to access the above private variables;


    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return Roll;
    }
    //  now use set method to update the private variables;
    public void setAge(int newAge){
        age=newAge;
    }
    public void setName(String newName){
        Name=newName;
    }
    public void setRoll(int newRoll){
        Roll=newRoll;
    }
}
