package BeeCrowd;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        int raio = scanner.nextInt();
        double volume = (4.0/3.0) * pi * Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
