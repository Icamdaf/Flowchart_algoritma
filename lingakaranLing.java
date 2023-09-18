import java.util.Scanner;

/**
 * lingakaranLing
 */
public class lingakaranLing {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        double phi = 3.14;
        int jariJari;
        double luas;
        double keliling;

    jariJari = input.nextInt();

    keliling = 2 * (phi * jariJari);
    luas = phi * (jariJari * jariJari);

    System.out.println(luas);
    System.out.println(keliling);

    input.close();
        



    



        
    
    }
}