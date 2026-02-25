package PertemuanPertama;

import java.util.Scanner;
public class sdl3_Array {
    static final int ELEMENTS_OF_A = 100;
    static final int ELEMENTS_OF_NEW = ELEMENTS_OF_A - 2;

    public static void main(String[] args) throws Exception { //throws Exception=untuk melempar jika ada kesalahan
        Scanner cin = new Scanner(System.in);
        int i;
        double[] a = new double[ELEMENTS_OF_A];
        for (i = 0; i <= ELEMENTS_OF_A - 1; i++) {
            a[i] = cin.nextDouble();//a[i] = Double.parseDouble(cin.nextLine()) = kegunaan untuk parse mengkonversi tipe data String ke tipe data lain.
        }
        double[] newArr = new double[ELEMENTS_OF_NEW];
        for (i = 0; i <= ELEMENTS_OF_NEW - 1; i++) {
            newArr[i] = (a[i] + a[i + 1] + a[i + 2]) / 3;
        }
        for (i = 0; i <= ELEMENTS_OF_NEW - 1; i++) {
            System.out.print(newArr[i] + "\t");

        }
    }
}