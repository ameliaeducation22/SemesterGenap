

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        //mencetak "" kelayar output
        int n = input.nextInt();
        //membaca input integer dan menyimpan nya ke variabel n
        input.nextLine();

        for (int i = 0; i < n; i++) {
            //Perulangan bersyarat, jika terpenuhi maka blok dijalankan
            Mahasiswa mahasiswa = new Mahasiswa();
            //membuat objek untuk Mahasiswa dengan nama mahasiswa

            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            //mencetak pesan di dalam "" dan nilai dari memori i + 1
            System.out.print("Masukkan Nama: ");
            mahasiswa.Nama = input.nextLine();

            System.out.print("Masukkan nilai uts1: ");
            // Menampilkan prompt untuk meminta input tinggi badan tanpa membuat garis baru
            mahasiswa.uts1 = input.nextDouble();
            // Membaca input Double dan menyimpannya ke variabel uts1

            System.out.print("Masukkan nilai uts2: ");
            // Menampilkan prompt untuk meminta input tinggi badan tanpa membuat garis baru
            mahasiswa.uts2 = input.nextDouble();
            // Membaca input Double dan menyimpannya ke variabel uts2

            System.out.print("Masukkan nilai ujian akhir semester: ");
            // Menampilkan prompt untuk meminta input tinggi badan tanpa membuat garis baru
            mahasiswa.uas = input.nextDouble();
            // Membaca input Double dan menyimpannya ke variabel uas
            input.nextLine();
            System.out.println("Nilai Mahasiswa: " + mahasiswa.Final());
            //mencetak pesan didalam "" dan memanggil data memori Final milik kelas mahasiswa
            mahasiswa.HitFinal();//Memanggil fungsi HitFinal milik kelas mahasiswa
        }
        input.close();
    }
}
