package PertemuanKedua;

public class Sdl3_EPrekursif {
    public static int fibo(int n){
        if (n == 2){//base case
            return 1;//mengembalikan 1
        }else if (n == 1){//base case
            return 1;//mengembalikan 1
        }else {//making progress
            return fibo(n - 2) + fibo(n - 1);//making progress
        }
    }
    public static void main(String[] args) {
        int Fibo = fibo(6);
        //deklarasi variabel Fibo dengan tipe data integer
        //inisiasi fibo(6) ke variabel Fibo
        System.out.println(Fibo);
        //mencetak data dari variabel Fibo
    }
}
