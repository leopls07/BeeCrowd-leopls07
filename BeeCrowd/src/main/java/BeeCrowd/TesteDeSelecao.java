package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDeSelecao {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] entrys = bf.readLine().split(" ");

        int a = Integer.parseInt(entrys[0]);
        int b = Integer.parseInt(entrys[1]);
        int c = Integer.parseInt(entrys[2]);
        int d = Integer.parseInt(entrys[3]);

        if(b> c && d > a && (c+d > a+b) && c > 0 && d > 0 && a%2==0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

    }
}
