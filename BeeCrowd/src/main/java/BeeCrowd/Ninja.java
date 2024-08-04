package BeeCrowd;

import java.io.*;

public class Ninja {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        int vezes = 0;
        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            while(n!=1){
                n = n/2;
                vezes ++;
            }
                System.out.println(vezes);
            vezes = 0;
        }
    }

}