package PertemuanPertama;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class sdl1_Array {
    static final int ELEMENTS = 8;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i;
        double[] a = new double[ELEMENTS];
        for (i = 0; i <= ELEMENTS - 1; i++) {
            System.out.print("Enter a value for element " + i + ": ");
            a[i] = Double.parseDouble(cin.nextLine());
        }
        for (i = 0; i <= ELEMENTS - 1; i++) {
           if (i % 2 != 0) {
                 System.out.print(a[i] + " ");
           }
        }
    }
}