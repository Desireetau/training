package Exercise2;

public class Number5 {
    public static void main (String[]args){
        int num [] = new int[4];

        num[0] = 0;
        num[1] = 28;
        num[2] = 56;
        num[3] = 84;


        /*for(int i=0;i<province.length;i++){
            System.out.println(province[i]);
        }*/
        int r=0;
        do{
            System.out.println(num[r]);

            r++;
        }while (r<num.length);
    }
}
