
import java.util.Scanner;
public class BujurSangkarMain {
    public static void main(String[] args) {//metode
        Scanner input = new Scanner(System.in);//Membuat objek Scanner untuk membaca input
        BujurSangkar bujur1=new BujurSangkar();//membuat objek untuk BujurSangkar dengan nama bujur1
        BujurSangkar bujur2=new BujurSangkar();//membuat objek untuk BujurSangkar dengan nama bujur2

        System.out.print("Masukkan sisi bujur sangkar I : ");
        //Mencetak pesan "" kelayar output
        bujur1.sisi = input.nextInt();
        //Membaca input nilai sisi dari keyboard dan menyimpan ke objek bujur1

        System.out.print("Masukkan sisi bujur sangkar II: ");
        //Mencetak pesan "" kelayar output
        bujur2.sisi = input.nextInt();
        //Membaca input nilai sisi dari keyboard dan menyimpan ke objek bujur1

        System.out.println("Luas Bujur Sangkar dengan sisi 1 = "+bujur1.sisi+" adalah "+bujur1.luas());
        //Menampilkan luas bujur sangkar pertama dengan memanggil method luas
        System.out.println("Luas Bujur Sangkar dengan sisi 2 = "+bujur2.sisi+" adalah "+bujur2.luas());
        //Menampilkan luas bujur sangkar kedua dengan memanggil method luas
    }
}
