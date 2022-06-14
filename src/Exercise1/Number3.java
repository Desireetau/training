package Exercise1;

public class Number3 {

    public static void main (String [] args){
        int num10 = 10;
        int num20 = 20;
        int temp = 0;

        temp=num10;
        System.out.println("Temp value: "+ temp);

        num10 = num20;
        System.out.println("Temp value: "+ num10);

        num20 = temp;
        System.out.println("Temp value: "+ num20);
    }
}
