package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intervalo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double entry = Double.parseDouble(bf.readLine());

        if(entry <= 25.0 && entry >= 0){
            System.out.println("BeeCrowd.Intervalo [0,25]");
        }else if(entry <= 50.0 && entry >= 0){
            System.out.println("BeeCrowd.Intervalo (25,50]");
        }else if(entry <= 75.0 && entry >= 0){
            System.out.println("BeeCrowd.Intervalo [50,75]");
        } else if (entry<=100 && entry >= 0) {
            System.out.println("BeeCrowd.Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
