package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AumentoDeSalario {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double entrada = Double.parseDouble(bf.readLine());
        double reajusteGanho;
        int pctReajuste = 4;
        if(entrada <= 400){
            pctReajuste = 15;
        }else if(entrada <= 800){
            pctReajuste = 12;
        }else if(entrada <= 1200){
            pctReajuste = 10;
        }else if(entrada <= 2000){
            pctReajuste = 7;
        }
        reajusteGanho = entrada * pctReajuste/100;
        System.out.printf("Novo salario: %.2f\n", (reajusteGanho+entrada));
        System.out.printf("Reajuste ganho: %.2f\n", (reajusteGanho));
        System.out.printf("Em percentual: %d %%\n", pctReajuste);

    }
}
