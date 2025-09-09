import java.util.Scanner;

public class CekNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 70) {
            System.out.println("Grade: B");
        } else if (nilai >= 60) {
            System.out.println("Grade: C");
        } else if (nilai >= 50) {
            System.out.println("Grade: D");
        } else if (nilai >= 0) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Nilai tidak valid!");
        }

        input.close();
    }
}
