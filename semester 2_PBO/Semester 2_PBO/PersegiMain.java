import javax.swing.*;
public class PersegiMain {
    public static void main(String[] args) {
        Persegi Persegi1=new Persegi();//membuat objek untuk Persegi dengan nama Persegi1
        Persegi1.panjang=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        //Memanggil metode panjang dan memasukan "" dengan tipe data int, dan jika data yang di input salah akan menampilkan error
        Persegi1.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        //Memanggil metode lebar dan memasukan "" dengan tipe data int, dan jika data yang di input salah akan menampilkan error
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang=" +Persegi1.panjang
                +" dan lebar = "+ Persegi1.lebar + " adalah "+Persegi1.luasPersegi());
        //Menampilkan inteface berupa pesan didalam tanda kutip

    }
}
