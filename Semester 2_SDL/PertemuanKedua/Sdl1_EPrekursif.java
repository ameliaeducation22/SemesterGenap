package PertemuanKedua;

public class Sdl1_EPrekursif {
    public static int paijo(int x) {
        if (x == 0)//base case
            return 0;//mengembalikan 0
        return 2 * paijo(x - 1) + x * x;//Making progress(rekursif)}
    }
    public static void main(String[] args) {
        int Hasil = paijo(4);
        //Deklarasi variabel Hasil dengan tipe data integer
        //inisiasi paijo(4) ke variabel  Hasil
        System.out.println("Hasil = " + Hasil);
        //mencetak "" keoutput dan memanggil data dari variabel Hasil
    }
}
