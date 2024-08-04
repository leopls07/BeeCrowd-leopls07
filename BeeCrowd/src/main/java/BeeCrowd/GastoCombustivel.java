package BeeCrowd;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int horas = s.nextInt();
        int kmh = s.nextInt();
        double distancia = horas * kmh;
        System.out.printf("%.3f\n",distancia/12);
    }
}
