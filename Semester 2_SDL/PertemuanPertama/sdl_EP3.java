package PertemuanPertama;

import java.util.Random;
import java.util.Scanner;
public class sdl_EP3 {
    public  static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        final int G = 50;//mendeklarasi konstanta jumlah data array, dan menginisiasi 50 ke data array
        int[] number = new int[G];//membuat array integer dengan jumlah 50
        Random rand = new Random();//membuat objek Random

        int jumlahBesar = 0, jumlahKecil = 0;//mendeklarasi variabel jumlahBesar dan jumlahKecil dengan tipe data integer, dan menginisiasi 0 ke variabel jumlahBesar dan jumlahKecil

        for(int i = 0; i < G; i++){//perulangan untuk angka random
            number[i] = rand.nextInt(100);//angka random dari 0 - 100
            if (number[i] > 50) {//blok kondisi jika angka lebih dari 50
                jumlahBesar ++;//mengincrement jumlahBesar
            }else if(number[i] < 50){//blok kondisi namun jika angka kurang dari 50
                jumlahKecil ++;//mencincrement jumlahKecil
            }
        }
        System.out.println("Masukkan data Array: ");//mencetak masukkan data
        System.out.println("Jumlah bilangan lebih dari 50: " +jumlahBesar);//mencetak jumlahBesar kelayar output
        System.out.println("Jumlah bilangan kurang dari 50: " +jumlahKecil);//mencetak jumlahKecil kelayar output
    }
}
