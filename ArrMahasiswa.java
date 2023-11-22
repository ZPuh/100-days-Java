package array;
import java.util.Scanner;
public class ArrMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        double[] nilai = new double[5];       
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ujian mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }        
        double total= 0;
        for (int i = 0; i < 5; i++) {
            total += nilai[i];
        }
        double rataRata = total / 5;       
        double Tertinggi = nilai[0];
        double Terendah = nilai[0];
        for (int i = 1; i < 5; i++) {
            if (nilai[i] > Tertinggi) {
                Tertinggi = nilai[i];
            }
            if (nilai[i] < Terendah) {
                Terendah = nilai[i];
            }
        }      
        System.out.println("\n--- Hasil Nilai Mahasiswa ---");
        System.out.println("Rata-rata Nilai: " + rataRata);
        System.out.println("Nilai Tertinggi: " + Tertinggi);
        System.out.println("Nilai Terendah: " + Terendah);
        sc.close();
    }    
}