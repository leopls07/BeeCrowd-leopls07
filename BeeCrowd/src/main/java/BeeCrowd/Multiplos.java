package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] entry = bf.readLine().split(" ");
        int n1 = Integer.parseInt(entry[0]);
        int n2 = Integer.parseInt(entry[1]);

        if(n1>=n2){
            if(n1%n2 == 0){
                System.out.println("Sao BeeCrowd.Multiplos");
            }else {
                System.out.println("Nao sao BeeCrowd.Multiplos");
            }
        }else{
            if(n2%n1 == 0){
                System.out.println("Sao BeeCrowd.Multiplos");
            }else {
                System.out.println("Nao sao BeeCrowd.Multiplos");
            }
        }
    }
}
