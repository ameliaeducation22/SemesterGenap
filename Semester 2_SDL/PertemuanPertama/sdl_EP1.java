package PertemuanPertama;

import java.util.Scanner;
public class sdl_EP1 {
    static final int NILAI = 11;//konstanta untuk menentukan jumlah data Array berjumlah 11

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);

        int i;//mendeklarasi variabel i dengan  tipe data integer
        int[] values = new int[NILAI];//mendeklarasi array dengan tipe data integer sesuai dengan konstanta NILAI
        for (i = 1; i <= NILAI - 1; i++) {//perulangan untuk menginput data dimulai dari  index 1 - 10 (NILAI - 1)
            System.out.print("Masukkan data integer " + i + ": ");//memasukkan data ke 1-10
            values[i] = Integer.parseInt(cin.nextLine());//membaca dan menyimpan data
        }
        System.out.println("Berikut Bilangan ganjil :");//mencetak data ganjil keoutput
        for (i = 1; i <= NILAI - 1; i++) { //perulangan untuk mengecek dan menampilkan bilangan ganjil
            if (values[i] % 2 != 0) {//mengecek apakah nilai tidak habis dibagi 2, jika sisa bagi bukan 0 berarti bilangan ganjil
                System.out.println(values[i]);//mencetak indeks values
            }
        }
    }
}
