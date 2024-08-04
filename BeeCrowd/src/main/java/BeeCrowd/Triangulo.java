package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Locale.setDefault(Locale.US);
        String[] entry = bf.readLine().split(" ");
        double a = Double.parseDouble(entry[0]), b = Double.parseDouble(entry[1]) , c = Double.parseDouble(entry[2]);
        double[] vet= {a,b,c};
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]> vet[maior]){
                maior = i;
            }
        }
        double soma = 0.0;
        for (int i = 0; i < vet.length; i++) {
            if(i!=maior){
                soma+= vet[i];
            }
        }
        if(soma > vet[maior]){
            double perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            double area = (a+b)*c /2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
