package BeeCrowd;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CedulasEMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dinero = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN);

        int cedulas100 = dinero >= 100 ? (int) dinero/100 : 0;
        dinero -= cedulas100 * 100;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        int cedulas50 = dinero >= 50 ? (int) dinero/50 : 0;
        dinero -= cedulas50 * 50;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        int cedulas20 = dinero >= 20 ? (int) dinero/20 : 0;
        dinero -= cedulas20 * 20;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        int cedulas10 = dinero >= 10 ? (int) dinero/10 : 0;
        dinero -= cedulas10 * 10;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        int cedulas5 = dinero >= 5 ? (int) dinero/5 : 0;
        dinero -= cedulas5 * 5;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        int cedulas2 = dinero >= 2 ? (int) dinero/2 : 0;
        dinero -= cedulas2 * 2;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));
        //MOEDAS
        int moedas1 = dinero >= 1 ? (int) dinero : 0;
        dinero -= moedas1;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));



        int moeda50 = dinero >= .50 ? (int) (dinero/.50) : 0;
        dinero -= moeda50 *.5;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));

        int moeda25 = dinero >= .25 ? (int) (dinero/.25) : 0;
        dinero -= moeda25 *.25;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));

        int moeda10 = dinero >= .10 ? (int) (dinero/.10) : 0;
        dinero -= moeda10 *.10;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));

        int moeda05 = dinero >= .05 ? (int) (dinero/.05) : 0;
        dinero -= moeda05 *.05;
        dinero = Double.parseDouble(df.format(dinero).replace(",","."));

        double moeda01 =  dinero >= .01 ?  (dinero/.01) : 0;


        System.out.printf(
                        "NOTAS:\n" +
                        "%d nota(s) de R$ 100.00\n" +
                        "%d nota(s) de R$ 50.00\n" +
                        "%d nota(s) de R$ 20.00\n" +
                        "%d nota(s) de R$ 10.00\n" +
                        "%d nota(s) de R$ 5.00\n" +
                        "%d nota(s) de R$ 2.00\n" +
                        "MOEDAS:\n"+
                        "%d moeda(s) de R$ 1.00\n" +
                        "%d moeda(s) de R$ 0.50\n" +
                        "%d moeda(s) de R$ 0.25\n" +
                        "%d moeda(s) de R$ 0.10\n" +
                        "%d moeda(s) de R$ 0.05\n" +
                        "%d moeda(s) de R$ 0.01\n"
                ,cedulas100,cedulas50,cedulas20,cedulas10,cedulas5,cedulas2,moedas1,moeda50,moeda25,moeda10,moeda05,(int)moeda01
        );
    }
}
