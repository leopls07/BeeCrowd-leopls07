package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Bhaskara {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Locale.setDefault(Locale.US);
        String[] entry = bf.readLine().split(" ");
        double a = Double.parseDouble(entry[0]), b = Double.parseDouble(entry[1]) , c = Double.parseDouble(entry[2]);

        double delta = (b*b) -4 * a * c;

        if(delta>0){
            if(a == 0){
                System.out.println("Impossivel calcular");
                return;
            }
            double r1 = (-b + Math.sqrt(delta)) /( 2*a);
            double r2 = (-b - Math.sqrt(delta)) /(2*a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }else if(delta == 0){
            double root = -b / (2 * a);
            System.out.printf("R1 = %.5f\n", root);
            System.out.printf("R2 = %.5f\n", root);
        }else {
            System.out.println("Impossivel calcular");
        }
    }
}
