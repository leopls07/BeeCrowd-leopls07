package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FelizNatal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        String a = "";
        for (int i = 0; i < x; i++) {
            a+= "a";
        }
        System.out.println("Feliz nat"+a+"l!");
    }
}
