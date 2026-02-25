package PertemuanPertama;

import java.util.Scanner;
public class sdl4_Array {
    static final int ELEMENTS = 100;

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int i, posIndex, negIndex;
        double[] ar = new double[ELEMENTS];
        for (i = 0; i <= ELEMENTS - 1; i++) {
            ar[i] = Double.parseDouble(cin.nextLine());
        }
//Create arrays pos and neg
        posIndex = 0;
        negIndex = 0;
        double[] pos = new double[ELEMENTS];
        double[] neg = new double[ELEMENTS];
        for (i = 0; i <= ELEMENTS - 1; i++) {
            if (ar[i] > 0) {
                pos[posIndex++] = ar[i];
            } else if (ar[i] < 0) {
                neg[negIndex++] = ar[i];
            }
        }
        for (i = 0; i <= posIndex - 1; i++) {
            System.out.print(pos[i] + "\t");
        }
        System.out.println();
        for (i = 0; i <= negIndex - 1; i++) {
            System.out.print(neg[i] + "\t");

        }
    }
}
