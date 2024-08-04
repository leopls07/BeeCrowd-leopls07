package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Estiagem {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int entry = Integer.parseInt(in.readLine().trim());
        int contador = 1;
        while(entry!=0){
            int qtdImoveis = entry;
            double consumoTotal = 0.0;
            double qtdMoradores = 0.0;
            int[] consumos = new int[201];
            for (int i = 0; i < qtdImoveis; i++) {
                String[] entradaMoradorEConsumo = in.readLine().split(" ");
                int moradores = Integer.parseInt(entradaMoradorEConsumo[0]);
                int consumo = Integer.parseInt(entradaMoradorEConsumo[1]);
                consumoTotal += consumo;
                qtdMoradores += moradores;

                consumos[consumo/moradores] += moradores;
            }
            System.out.println("Cidade# " + contador + ":");
            boolean first = true;
            for (int i = 0; i < 201; i++) {
                //posicao = consumo
                //valor dentro da posicao = moradores;
                if(consumos[i]>0){
                    if(first){
                        first = false;
                    }else{
                        System.out.print(" ");
                    }
                    System.out.printf("%d-%d",consumos[i],i);
                }
            }
            double consumoMedio = ((int) ((consumoTotal/ qtdMoradores) * 100) )/100.00;
            System.out.println(String.format("\nBeeCrowd.Consumo medio: %.2f m3.\n",consumoMedio).replace(",","."));
            entry = Integer.parseInt(in.readLine());
            contador++;
        }
    }

}