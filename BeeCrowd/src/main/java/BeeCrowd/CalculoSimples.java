package BeeCrowd;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1codigo = scanner.nextInt();
        int p1qtd = scanner.nextInt();
        double p1valor = scanner.nextDouble();
        int p2codigo = scanner.nextInt();
        int p2qtd = scanner.nextInt();
        double p2valor = scanner.nextDouble();
        double total = (p1valor*p1qtd) + (p2valor*p2qtd);
        System.out.printf("VALOR A PAGAR: R$ %.2f",total);
    }
}
