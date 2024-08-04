package BeeCrowd;

import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double media = ((n1 * 2) +  (n2 *  3) + (n3 * 5)) / 10;
        System.out.printf("MEDIA = %.1f\n",media);
    }
}
