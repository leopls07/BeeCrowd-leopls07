package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomaDeImparesConsecutivosIII {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int cases = Integer.parseInt(in.readLine());

        for (int i = 0; i < cases; i++) {
            String[] entrada = in.readLine().split(" ");
            int n = Integer.parseInt(entrada[0]);
            int x = Integer.parseInt(entrada[1]);
            int total = 0;
            while(x>0){
                if(n%2!=0){
                    total+= n;
                    x--;
                    n++;
                }
                    n++;
            }
            System.out.println(total);
        }
    }
}
