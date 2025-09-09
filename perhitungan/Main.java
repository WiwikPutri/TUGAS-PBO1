package perhitungan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println(a + " + " + b + " = " + calc.tambah(a, b));
        System.out.println(a + " * " + b + " = " + calc.kali(a, b));

        input.close();
    }
}
