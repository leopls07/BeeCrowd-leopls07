package BeeCrowd;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int diferenca = (n1*n2) - (n3*n4);
        System.out.printf("DIFERENCA = %d\n",diferenca);
    }
}
