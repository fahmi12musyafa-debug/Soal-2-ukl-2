import java.util.Scanner;

public class LatihanSoal2Ukl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung");
        double r = input.nextDouble();
         
        System.out.print("Masukkan tinggi tabung");
        double t = input.nextDouble();

        double volume = hitungVolumeTabung(r,t);
        System.out.println("Volume tabung adalah: " + volume);
    }

    private static double hitungVolumeTabung(double r, double t) {
        double phi = Math.PI;
        double volume = phi * Math.pow(r, 2) * t;
        return volume;
    }


}
