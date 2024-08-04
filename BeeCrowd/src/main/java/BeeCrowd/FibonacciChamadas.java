package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciChamadas {
    static int calls = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());

        for (int i = 0; i < times; i++) {
            int n = Integer.parseInt(bf.readLine());
            calls=0;
            int fib = fib(n);
            System.out.printf("fib(%d) = %d calls = %d\n",n,calls -1,fib);

        }

    }
    static int fib(int n){
        if(n == 0){
            calls++;
            return 0;
        }else if(n==1){
            calls++;
            return 1;
        }else{
            calls++;
            return (fib(n-1) + fib(n-2));
        }
    }


}
