
//import library scanner ke program
import java.util.Scanner; 

public class Ganjilgenap {

    public static void main(String[] args) {
        
        //deklarasi variabel
        int i, n;

        //membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        n = input.nextInt();
        i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(Integer.toString(i) + " adalah genap");
            } else {
                System.out.println(Integer.toString(i) + " adalah ganjil");
            }
            i = i + 1;
        }

        
    }
}