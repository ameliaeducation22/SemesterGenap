package PertemuanPertama;

import java.util.Scanner;
public class sdl2_Array {
    static final int ELEMENTS = 100;

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);

        int i;
        int[] values = new int[ELEMENTS];
        for (i = 0; i <= ELEMENTS - 1; i++) {
            values[i] = Integer.parseInt(cin.nextLine());
        }
            for (i = 1; i <= ELEMENTS - 1; i += 2) {   //Start from 1 and increment by 2
                if (values[i] % 2 == 0) {
                    System.out.println(values[i]);
                }
        }
    }
}