package BeeCrowd;

import java.util.Scanner;

public class ConversaodeTempo {
    public static void main(String[] args) {
        int segundos = new Scanner(System.in).nextInt();
        int horas = segundos/60/60;
        segundos -= horas*60*60;
        int minutos = segundos/60;
        segundos -= minutos*60;
        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
    }
}
