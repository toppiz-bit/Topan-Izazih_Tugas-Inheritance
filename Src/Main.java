import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    // Method bantu supaya kode di menu lebih singkat
    static String bacaTeks(String pesan) {
        System.out.print(pesan);
        return input.nextLine();
    }

    static double bacaAngka(String pesan) {
        System.out.print(pesan);
        return Double.parseDouble(input.nextLine());
    }

    public static void main(String[] args) {
        int pilihan = -1;

        do {
            System.out.println("\n===== MENU BENTUK =====");
            System.out.println("1. Buat Bujursangkar");
            System.out.println("2. Buat Lingkaran");
            System.out.println("3. Buat Silinder");
            System.out.println("0. Keluar");

            try {
                pilihan = Integer.parseInt(bacaTeks("Pilih menu: "));

                switch (pilihan) {
                    case 1: {
                        double sisi = bacaAngka("Sisi: ");
                        String warna = bacaTeks("Warna: ");
                        bujursangkar bs = new bujursangkar(sisi, warna);
                        bs.printInfo();
                        break;
                    }
                    case 2: {
                        double radius = bacaAngka("Radius: ");
                        String warna = bacaTeks("Warna: ");
                        lingkaran l = new lingkaran(radius, warna);
                        l.printInfo();
                        break;
                    }
                    case 3: {
                        double tinggi = bacaAngka("Tinggi: ");
                        double radius = bacaAngka("Radius: ");
                        String warna = bacaTeks("Warna: ");
                        silinder s = new silinder(tinggi, radius, warna);
                        s.printInfo();
                        break;
                    }
                    case 0:
                        System.out.println("Program selesai.");
                        break;
                    default:
                        System.out.println("Menu tidak ada, coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka, coba lagi.");
            }
        } while (pilihan != 0);
    }
}
