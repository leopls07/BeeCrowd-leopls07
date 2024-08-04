package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] entry = bf.readLine().split(" ");
        int h1 = Integer.parseInt(entry[0]) * 60;
        int m1 = Integer.parseInt(entry[1]);
        int h2 = Integer.parseInt(entry[2]) * 60;
        int m2 = Integer.parseInt(entry[3]);

        int totalJ1 = h1 + m1;
        int totalJ2 = h2 + m2;

        int totalMinutos = totalJ2 > totalJ1 ? totalJ2 - totalJ1 :  (totalJ2 + 24 *60)  -  totalJ1  ;
        int totalHorasResultado = totalMinutos;


        totalHorasResultado = totalHorasResultado/60;
        totalMinutos -= totalHorasResultado * 60;

        if(totalHorasResultado == 0 && totalMinutos < 1){
            totalHorasResultado = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",totalHorasResultado,totalMinutos);
    }
}
