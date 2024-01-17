import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("## Program java Biodata Mahasiswa ##");
        System.out.println("=================================");
        System.out.println("");

        String nama, nim, fakulstas, jurusan, kota_asal, alamat;

        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Nim Mahasiswa : ");
        nim = input.nextLine();

        System.out.print("Fakultas Mahasiswa : ");
        fakulstas = input.nextLine();

        System.out.print("Jurusan Mahasiswa : ");
        jurusan = input.nextLine();

        System.out.print("Kota asal Mahasiswa : ");
        kota_asal = input.nextLine();

        System.out.print("Alamat Mahasiswa : ");
        alamat = input.nextLine();

        System.out.println("## Data Mahasiswa ##");
        System.out.println("====================");
        System.out.println("Nama" + " " +nama);
        System.out.println("Nim" + " " +nim);
        System.out.println("Fakultas" + " " + fakulstas);
        System.out.println("Jurusan" + " " + jurusan);
        System.out.println("Kota asal" + " " + kota_asal);
        System.out.println("Alamat" + " " +alamat);



        }
    }
