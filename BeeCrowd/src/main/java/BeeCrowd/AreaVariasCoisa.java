package BeeCrowd;

import java.util.Scanner;

public class AreaVariasCoisa
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double areaTrianguloRetangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * (c*c);
        double areaTrapezio = ((a + b) * c) /2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        System.out.printf(
                "TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n"
                ,areaTrianguloRetangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo);
    }
}
