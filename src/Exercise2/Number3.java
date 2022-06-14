package Exercise2;

public class Number3 {
    public static void main (String[]args){
        String province [] = new String[7];

        province[0] = "Gauteng";
        province[1] = "Limpopo";
        province[2] = "Mpumalanga";
        province[3] = "Western Cape";
        province[4] = "Eastern Cape";
        province[5] = "Free State";
        province[6] = "KwaZulu Natal";

        /*for(int i=0;i<province.length;i++){
            System.out.println(province[i]);
        }*/
        int r=0;
        do{
            System.out.println(province[r]);
            r++;
        }while (r<province.length);
    }

}
