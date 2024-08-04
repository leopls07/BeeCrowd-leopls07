package BeeCrowd;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        double[] prices = {4.00, 4.50,5.00,2.00,1.50};
        Scanner scanner = new Scanner(System.in);
        String[] entry = scanner.nextLine().split(" ");
        int code = Integer.parseInt(entry[0]);
        int quantity = Integer.parseInt(entry[1]);

        double total = quantity * prices[code -1];
        System.out.printf("Total: R$ %.2f\n",total);

    }
}
