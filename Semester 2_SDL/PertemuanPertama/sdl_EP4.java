package PertemuanPertama;

import java.util.Scanner;
public class sdl_EP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[]Nama = new String[20];//membuat array string untuk menyimpan 20 nama mahasiswa
        System.out.println("Masukkan Nama: ");//mencetak masukkan nama kelayar output
        for (int i = 1; i < 20; i++) {//perulangan nilai dari 1 - 20
            System.out.print("Nama Mahasiswa ke-" +i+ ": ");//masukkan nama mahasiswa ke-
            Nama[i] = input.nextLine();//membaca dan menyimpan Nama
        }
        System.out.println("Nama Mahasiswa berawalan A: ");//mencetak nama mahasiswa berawal A kelayar output
        for (int i = 1; i < 20; i++) {//perulangan untuk mengecek nama yang diawali huruf A
            if (Nama[i].startsWith("A")){//mengecek apakah nama diawali dengan huruf A
                System.out.println(Nama[i]);//jika iya maka nama di tampilkan
            }
        }
    }
}
