package BeeCrowd;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        double raio = scanner.nextDouble();
        double area = pi * (raio * raio);
        System.out.printf("A=%.4f\n",area);
    }
}
