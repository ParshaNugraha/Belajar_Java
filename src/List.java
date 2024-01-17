import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Pilihan:");
        System.out.println("1. Nasi Goreng (Rp 15.000,00)");
        System.out.println("2. Mie Ayam (Rp 10.000,00)");
        System.out.println("3. Bakso (Rp 13.000,00)");

        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();


        int harga = 0;


        switch (pilihan) {
            case 1:
                harga = 15000;
                break;
            case 2:
                harga = 10000;
                break;
            case 3:
                harga = 13000;
                break;
            default:
                System.out.println("Salah Pilih! :(");
                return;
        }


        System.out.print("jumlah pesan: ");
        int jumlahPesan = scanner.nextInt();


        int totalBayar = harga * jumlahPesan;


        System.out.println("=========================");
        System.out.println("Nama Pemesan: " + nama);
        System.out.println("Pesanan: " + getPesanan(pilihan));
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah pesan: " + jumlahPesan);
        System.out.println("Total Bayar: Rp " + totalBayar);

        scanner.close();
    }


    private static String getPesanan(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Nasi Goreng";
            case 2:
                return "Mie Ayam";
            case 3:
                return "Bakso";
            default:
                return "Unknown";
        }
    }
}
