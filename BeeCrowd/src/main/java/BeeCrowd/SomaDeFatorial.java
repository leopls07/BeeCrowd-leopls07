package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SomaDeFatorial {
    static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        while(true){
            leCalculaExibe();
        }
    }

    public static void leCalculaExibe() throws IOException {
        try{
            long[] entries = Arrays.stream(bf.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            System.out.println(calculaFatorial(entries[0]) + calculaFatorial(entries[1]));
        }catch (Exception e){
            System.exit(0);
        }
    }

    public static long calculaFatorial(long n){
        if(n == 0 || n == 1) return 1;
        long fatorial = n;
        for (long i = (n - 1); i > 0; i--) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
