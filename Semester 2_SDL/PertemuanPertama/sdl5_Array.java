package PertemuanPertama;

import java.util.Scanner;
public class sdl5_Array {
    static final int STUDENTS = 200;

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int i, maximum;
        String[] names = new String[STUDENTS];
        int[] grades = new int[STUDENTS];
        for (i = 0; i <= STUDENTS - 1; i++) {
//Prompt the user to enter a name and validate it.
            System.out.print("Enter name for student No " + (i + 1) + ": ");
            names[i] = cin.nextLine();
            while (names[i].equals("")) {
                System.out.println("Error! Name cannot be empty!");
                System.out.print("Enter name for student No " + (i + 1) + ": ");
                names[i] = cin.nextLine();
            }
//Prompt the user to enter a grade and validate it.
            System.out.print("Enter their grade: ");
            grades[i] = Integer.parseInt(cin.nextLine());
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Invalid value!");
                System.out.print("Enter their grade: ");
                grades[i] = Integer.parseInt(cin.nextLine());
            }
        }
//Find the greatest grade
        maximum = grades[0];
        for (i = 1; i <= STUDENTS - 1; i++) {
            if (grades[i] > maximum) {
                maximum = grades[i];
            }
        }
//Displays the names of all those who share the one greatest grade
        System.out.println("The following students have got the greatest grade:");
        for (i = 0; i <= STUDENTS - 1; i++) {
            if (grades[i] == maximum) {
                System.out.println(names[i]);
            }
        }
    }
}