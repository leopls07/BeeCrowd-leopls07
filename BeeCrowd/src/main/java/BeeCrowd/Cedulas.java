package BeeCrowd;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer dinero = scanner.nextInt();
        int dineroFinal = dinero;
        //120
        int cedulas100 = dinero >= 100 ? dinero/100 : 0;
        dinero -= cedulas100 * 100;
        int cedulas50 = dinero >= 50 ? dinero/50 : 0;
        dinero -= cedulas50 * 50;
        int cedulas20 = dinero >= 20 ? dinero/20 : 0;
        dinero -= cedulas20 * 20;
        int cedulas10 = dinero >= 10 ? dinero/10 : 0;
        dinero -= cedulas10 * 10;
        int cedulas5 = dinero >= 5 ? dinero/5 : 0;
        dinero -= cedulas5 * 5;
        int cedulas2 = dinero >= 2 ? dinero/2 : 0;
        dinero -= cedulas2 * 2;
        int cedulas1 =dinero >= 1 ? dinero : 0;

        System.out.printf(
                "%d\n" +
                "%d nota(s) de R$ 100,00\n" +
                "%d nota(s) de R$ 50,00\n" +
                "%d nota(s) de R$ 20,00\n" +
                "%d nota(s) de R$ 10,00\n" +
                "%d nota(s) de R$ 5,00\n" +
                "%d nota(s) de R$ 2,00\n" +
                "%d nota(s) de R$ 1,00\n",
                dineroFinal,cedulas100,cedulas50,cedulas20,cedulas10,cedulas5,cedulas2,cedulas1
        );

    }
}
