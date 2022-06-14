package Exercise2;

public class Number2 {
    public static void main(String[] args) {
        String name[][] = new String[3][3];
        name[0][0] = "John";
        name[1][0] = "Thato";
        name[2][0] = "Motewo";
        name[0][1] = "Rambuda";
        name[1][1] = "Tshepo";
        name[2][1] = "Karabo";
        name[0][2] = "Moropane";
        name[1][2] = "Neo";
        name[2][2] = "Nkosi";

        for (int r = 0; r < name.length; r++) {
            for (int c = 0;c< name [r].length; c++) {
                System.out.println(name[r][c]);
            }
        }
    }
}
