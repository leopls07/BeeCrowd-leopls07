package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TipoDeTriangulo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double[] entries = Arrays.stream(bf.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        int pMaior = 0;
        int pOutro1 = -1;
        int pOutro2 = -1;

        for (int i = 1; i < entries.length; i++) {
            if (entries[i] > entries[pMaior]) {
                pOutro2 = pOutro1;
                pOutro1 = pMaior;
                pMaior = i;
            } else if (pOutro1 == -1) {
                pOutro1 = i;
            } else if (pOutro2 == -1) {
                pOutro2 = i;
            }
        }

        double a = entries[pMaior];
        double b = entries[pOutro1];
        double c = entries[pOutro2];

        if(a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if((a*a) == ((b*b) + (c*c))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(a*a > ((b*b) + (c*c))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if( a*a < ((b*b) + (c*c))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        }else if(a == b || a == c || b == c){
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
