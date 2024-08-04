package BeeCrowd;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivelgasto = scanner.nextDouble();
        System.out.printf("%.3f km/l\n",distancia/combustivelgasto);
    }
}
