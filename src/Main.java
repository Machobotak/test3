import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hello World");
        String nama ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println(nama);

        int barang[]={2,3,4,5};
        for(int x : barang) {
            System.out.println(x);
        }

    }


}