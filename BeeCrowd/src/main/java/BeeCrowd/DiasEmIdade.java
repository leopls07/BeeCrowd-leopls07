package BeeCrowd;

import java.util.Scanner;

public class DiasEmIdade {
    public static void main(String[] args) {
        int dias = new Scanner(System.in).nextInt();
        int anos = dias/365;
        dias -= anos*365;
        int meses = dias/30;
        dias -= meses*30;
        System.out.printf(
                "%d ano(s)\n"+
                "%d mes(es)\n" +
                "%d dia(s)\n",anos,meses,dias);
    }
}
