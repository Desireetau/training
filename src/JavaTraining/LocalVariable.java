package JavaTraining;

public class LocalVariable {
    public void delage(){
        int age = 34;
        System.out.println("Your age is " + age);
    }

    public static void main (String [] args){
        LocalVariable obj = new LocalVariable();
        obj.delage();
    }
}
