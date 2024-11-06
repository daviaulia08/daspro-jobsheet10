import java.util.Scanner;

public class siakad08 {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan baris :");
        int baris = sc.nextInt();
        System.out.print("Masukkan kolom :");
        int kolom = sc.nextInt();


        int[][] nilai = new int[baris][kolom];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/kolom);
        }

        System.out.println("\n=====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < kolom; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mata kuliah " + (j+1) + ": " + totalPerMatkul/baris);
        }
    }
}