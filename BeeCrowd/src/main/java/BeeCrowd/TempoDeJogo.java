package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TempoDeJogo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] entry = bf.readLine().split(" ");
        int n1 = Integer.parseInt(entry[0]);
        int n2 = Integer.parseInt(entry[1]);

        if(n2<=n1)n2 += 24;
        int result = n2 -n1;
        System.out.printf("O JOGO DUROU %d HORA(S)\n",result);
    }
}
