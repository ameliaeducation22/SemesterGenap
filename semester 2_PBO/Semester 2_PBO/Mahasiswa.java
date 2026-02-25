//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gu
public class Mahasiswa {

    String Nama;
    //Deklarasi variabel nama dengan tipe data String
    double uts1, uts2, uas, Final;
    //Deklarasi uts1, uts2, uas, HitFinal dengan tipe data double

    public double Final() {
        Final = ((0.3 * uts1) + (0.3 * uts2) + (0.4 * uas));
        //menghitung Final menggunakan rumus (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas)
        return Final;
    }

    public void HitFinal() {
        if (Final >= 80) {
            //pernyataan jika Final lebih atau sama dengan 80
            System.out.println("Nilai final : A");
            //maka output akan mencetak "Nilai final : A"
        } else if (Final >= 65 && Final < 80) {
            //namun jika Final lebih atau sama dengan 65 dan kurang dari 80
            System.out.println("Nilai final : B");
            //maka output akan mencetak "Nilai final : B"
        } else if (Final >= 55 && Final < 65) {
            //namun jika Final lebih atau sama dengan 55 dan kurang dari 65
            System.out.println("Nilai final : C");
            //maka output akan mencetak "Nilai final : C"
        } else if (Final >= 45 && Final < 55) {
            //namun jika Final lebih atau sama dengan 45 dan kurang dari 55
            System.out.println("Nilai final : D");
            //maka output akan mencetak "Nilai final : D"
        } else {//Selain itu jika tidak memenuhi pernyataan diatas/nilaiTotal dibawah 50
            System.out.println("Nilai final : E");
            //maka output akan mencetak "Nilai final : E"
        }
    }
}