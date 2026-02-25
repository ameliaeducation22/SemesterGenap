package PertemuanKedua;

public class Sdl2_EPrekursif {
    public static int upAndDown(int n) {
        System.out.print("\nLevel: " + n);//mencetak "" keoutput
        if (n < 4)//base case
            upAndDown(n + 1);//making progress
        System.out.print("\nLEVEL: " + n);//mencetak "" keoutput dan memanggil data dari variabel n
        return n;//mengembalikan n
    }
    public static void main(String[] args) {
        int level= upAndDown(0);
        //deklarasi variabel level dengan tipe data integer
        //inisiasi upAndDown(0) ke variabel level
        System.out.println();
        //cetak baris baru
        System.out.println("Tingkat: " + level);
        //cetak "" keoutput dan memanggil data dari variabel level
    }
}
