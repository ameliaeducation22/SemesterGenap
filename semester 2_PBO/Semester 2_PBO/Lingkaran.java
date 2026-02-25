//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lingkaran {
        double r;//Deklarasi r dengan tipe data double
        double luas;//Deklarasi luas dengan tipe data double
        final double PHI = 3.14;//Deklarasi PHI dengan tipe data double, tidak dapat diubah karena nilai final

        public void luas () {//metode
            r = 7;//inisiasi 7 ke r
            luas = PHI * r * r;//inisiasi PHI * r * r ke luas

            System.out.println("Luas lingkaran dengan jari=" + r + " adalah : " + luas);
            //Mencetak "" kelayar ouput
        }
    }