package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String e1,e2,e3;

        e1 = bf.readLine();
        e2 = bf.readLine();
        e3 = bf.readLine();

        if(e1.equals("vertebrado")){
            if(e2.equals("ave")){
                if(e3.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(e3.equals("onivoro")){
                    System.out.println("homem");
                }else {
                    System.out.println("vaca");
                }
            }
        }else{
            if(e2.equals("inseto")){
                if(e3.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else if(e2.equals("anelideo")){
                if(e3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(e3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

    }
}
