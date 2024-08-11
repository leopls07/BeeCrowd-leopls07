package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimosRapidos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int qtt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < qtt; i++) {
            int n = Integer.parseInt(bf.readLine());
            isPrime(n);
        }
    }

    static void isPrime(int n){
        if(n <= 1 ){
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
