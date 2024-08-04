package BeeCrowd;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double media = ((n1 * 3.5) +  (n2 *  7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n",media);
    }
}
