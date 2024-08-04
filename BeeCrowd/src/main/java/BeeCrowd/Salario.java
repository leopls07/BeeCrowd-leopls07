package BeeCrowd;

import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short numeroFunc = s.nextShort();
        short horasTrabalhadas = s.nextShort();
        double valorHora = s.nextDouble();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numeroFunc,valorHora*horasTrabalhadas);
    }
}
