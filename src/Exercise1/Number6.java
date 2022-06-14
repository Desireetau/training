package Exercise1;

public class Number6 {

    public static void main (String [] args){

        String str1 = "I don't like programming";
        String str2 = " its better to go home";

        System.out.println("The index of k:"+" "+ str1.charAt(10));
        System.out.println("The index of k:"+" "+ str2.indexOf('g'));
        System.out.println(str1.concat(str2));
        System.out.println("The substring (better):"+" "+ str2.substring(5,11));
        System.out.println("str2 to uppercase" + " " + str2.toUpperCase());
        System.out.println(str1.indexOf('p',1));
    }
}
