package BeeCrowd;

import java.util.Scanner;
public class MaiorAbc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maiorAb = (a+b+Math.abs(a-b)) /2 ;
        int maiorAbc = (maiorAb + c + Math.abs(maiorAb-c))/2;
        System.out.printf("%d eh o maior\n",maiorAbc);
    }
}
