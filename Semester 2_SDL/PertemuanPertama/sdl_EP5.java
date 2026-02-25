package PertemuanPertama;

import java.util.Scanner;
public class sdl_EP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] Nama = new String[20];//membuat array string untuk menyimpan 20 nama mahasiswa
        System.out.println("Masukkan Nama: ");//mencetak masukkan nama kelayar output
        for (int i = 1; i < 20; i++) {//perulangan nilai dari 1 - 20
            System.out.print("Nama Mahasiswa ke-" + i + ": ");//masukkan nama mahasiswa ke-
            Nama[i] = input.nextLine();//membaca dan menyimpan Nama
        }
        System.out.println("Nama Mahasiswa berawalan A: ");//mencetak nama mahasiswa berawal A kelayar output
        for (int i = 1; i < 20; i++) {//perulangan untuk mengecek nama yang diawali huruf A
            if (Nama[i].startsWith("A")|| Nama[i].startsWith("a")) {//mengecek apakah nama diawal huruf A atau a
                System.out.println(Nama[i]);//jika iya maka nama di tampilkan
            }
        }
        System.out.println("Inisial Mahasiswa: ");//mencetak inisial mahasiswa kelayar output
        for (int i = 1; i < 20; i++) {//perulangan untuk membuat inisial setiap mahasiswa
            String Name = Nama[i];//menyimpan nama ke variabel sementara

            if (!Name.isEmpty()) {//mengecek agar string tidak kosong
                char awal = Nama[i].charAt(0);//mengambil huruf pertama / awal
                char akhir = Nama[i].charAt(Name.length() - 1);//mengambil huruf terakhir / akhir
                String inisial = (""  + awal + akhir).toUpperCase();//menggabungkan huruf awal dan akhir lalu mengubah menjadi huruf besar
                System.out.println(Name + " " + inisial);//menampilkan nama dan insialnya
            }
        }
    }
}
