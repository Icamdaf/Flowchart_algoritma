import java.util.Scanner;
/**
 * segitiga
 */
public class segitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        int luas;
        int keliling;
        int sisi;

        alas = input.nextInt();
        tinggi = input.nextInt();
        sisi = input.nextInt();


        luas = alas * tinggi /2;
        keliling = sisi + sisi + sisi;
     
        System.out.println(luas);
        System.out.println(keliling);

    }
}