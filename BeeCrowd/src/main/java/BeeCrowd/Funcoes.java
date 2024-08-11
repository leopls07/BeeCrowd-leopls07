package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Funcoes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int qtt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < qtt; i++) {
            int[] n = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            quemGanhou(n[0],n[1]);
        }
    }

    static void quemGanhou(int x, int y){
        int rafael = (3*x) * (3*x)  + (y * y);
        int beto = 2 * (x * x) + (5 * y) * (5 * y);
        int carlos = (-100*x) + (y * y *y);

        if(rafael > beto && rafael >carlos){
            System.out.println("Rafael ganhou");
        }
        if(beto > rafael && beto >carlos){
            System.out.println("Beto ganhou");
        }
        if(carlos > rafael && carlos > beto){
            System.out.println("Carlos ganhou");
        }
    }
}
