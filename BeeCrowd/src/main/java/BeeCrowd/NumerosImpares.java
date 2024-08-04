package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumerosImpares {
    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for (int i = 1; i <= x ; i++) {System.out.printf(i % 2 != 0 ? i+"\n" : "");}
    }
}
