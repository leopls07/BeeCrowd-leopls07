package BeeCrowd;

import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casosTeste = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < casosTeste; i++) {
            StringBuilder texto = new StringBuilder(scanner.nextLine());

            // 1
            for (int j = 0; j < texto.length(); j++) {
                int codigo = texto.charAt(j);
                if(codigo >= 65 && codigo <= 90 || codigo >= 97 && codigo <= 122){
                texto.setCharAt(j,(char) (codigo + 3));
               }
            }

            // 2
            texto.reverse();

            for (int j = texto.length() / 2; j < texto.length(); j++) {
                int codigo = texto.charAt(j);
                texto.setCharAt(j,(char) (codigo - 1));
            }
            System.out.println(texto);
        }

    }
}
