package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quadrantes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double[] entries = Arrays.stream(bf.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        double x = entries[0];
        double y = entries[1];
        String message = "Origem";

        if(x>0 && y>0){
            message = "Q1";
        }else if(x>0 && y<0){
            message = "Q4";
        }else if(y>0 && x<0){
            message = "Q2";
        }else if(y<0 && x<0){
            message = "Q3";
        } else if (x == 0.0 && y!=0.0) {
            message = "Eixo Y";
        }else if(y==0.0 && x!=0.0){
            message = "Eixo X";
        }
        System.out.println(message);

    }
}
