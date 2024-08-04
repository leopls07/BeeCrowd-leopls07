package BeeCrowd;

import java.util.Scanner;
public class SalarioBonus {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String n = s.nextLine();
            double salarioFixo = s.nextDouble();
            double valorVendas = s.nextDouble();
            System.out.printf("TOTAL = R$ %.2f\n", salarioFixo + (valorVendas * .15));
        }
    }

