package PertemuanKedua;

public class Sdl4_EPrekursif {
    public static int fibonacci(int n) {//method
        if ((n == 1 || n == 0)) {//base case
            return n;//mengembalikan n
        }else{//making progress
            return fibonacci(n-2) + fibonacci(n-1);//making progress
        }
    }
    public static void main(String[] args) {
        int Fibonacci = fibonacci(6);
        //deklarasi variabel Fibonacci dengan tipe data integer
        //inisiasi fibonacci(6) ke variabel Fibonacci
        System.out.println(Fibonacci);
        //mencetak data dari variabel Fibonacci
    }
}
