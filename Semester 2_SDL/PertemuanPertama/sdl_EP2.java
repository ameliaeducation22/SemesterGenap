package PertemuanPertama;

import java.util.Scanner;
public class sdl_EP2 {
    static final int NILAI = 11;//

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);

        int i;//mendeklarasi varieabel i dengan tipe data integer
        double total = 0, jumlah = 0;//mendeklarasi variabel total dan jumlah dengan tipe data double, dan menginisiasi 0 ke variabel jumlah dan total

        int[] values = new int[NILAI];//mendeklarasi array dengan tipe data integer sesuai dengan konstanta NILAI
        for (i = 1; i <= NILAI - 1; i++) {//perulangan untuk menginput data dimulai dari  index 1 - 10 (NILAI - 1)
            System.out.print("Masukkan data integer " + i + ": ");//memasukkan data ke 1-10
            values[i] = Integer.parseInt(cin.nextLine());//membaca dan menyimpan data
        }
        for (i = 1; i <= NILAI - 1; i += 2) { //perulangan untuk mengecek dan menampilkan bilangan ganjil
            System.out.println("Berikut bilangan ganjil :"  + values[i] + " ");//mencetak data ganjil keoutput
           if (values[i] % 2 != 0) {//mengecek apakah nilai tidak habis dibagi 2, jika sisa bagi bukan 0 berarti bilangan ganjil
               total += values[i];//menghitung total dari array values
               jumlah++;//mengincrement jumlah
           }
        }
        System.out.println("total :" + total);//mencetak dan menampilkan total
        double ratarata = (double) total/jumlah;//menghitung ratarata dan mengkonversi tipe data integer ke tipe data double
        System.out.println("Rata-rata: " + ratarata);//mencetak dan menampilkan hasil ratarata
    }
}
