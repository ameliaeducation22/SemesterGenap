package PertemuanKedua;

public class sdlContoh_rekursif {
    public static void main(String[] args) {
        count(0);
        System.out.println();
    }

    public static void count (int index)
    {
        System.out.print(index);
        if (index < 2)
            count(index+1);

    }
}
