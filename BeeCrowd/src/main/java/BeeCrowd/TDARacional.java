package BeeCrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TDARacional {
    public static void main(String[] args) {
        Map<Integer,String> values = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int qtdCasos = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < qtdCasos; i++) {
            String operation = "";

            operation += scan.nextLine().trim();

            values.put(i+1,operation);
        }

        for (int i = 0; i < values.size(); i++) {
            String conta = values.get(i+1).trim();

            String operadorAritmetico;

            if(conta.contains("+")) operadorAritmetico = "+";
            else if(conta.contains("-"))operadorAritmetico = "-";
            else if(conta.contains("*")) operadorAritmetico = "*";
            else operadorAritmetico = "/";




            String antesDaPrimeiraBarra = conta.substring(0,(conta.indexOf("/") + 1));
            String tudoDepoisDaBarra = conta.substring(conta.indexOf("/") +1);
            String depoisDaPrimeiraBarraAntesDoOperador = tudoDepoisDaBarra.substring(0,tudoDepoisDaBarra.indexOf(operadorAritmetico));
            String primeiroRacional = (antesDaPrimeiraBarra + depoisDaPrimeiraBarraAntesDoOperador);
            String segundoRacional = conta.substring(conta.indexOf(operadorAritmetico)+1);
            if(operadorAritmetico == "/"){
                segundoRacional = tudoDepoisDaBarra.substring(conta.indexOf("/") +1);
            }



            Integer n1 = Integer.parseInt(primeiroRacional.split("/")[0]);
            Integer d1 = Integer.parseInt(primeiroRacional.split("/")[1]);

            Integer n2 = Integer.parseInt(segundoRacional.split("/")[0]);
            Integer d2 = Integer.parseInt(segundoRacional.split("/")[1]);

            Integer numeradorResultado = null;
            Integer denominadorResultado = null;
            switch (operadorAritmetico){
                case  "+" -> {
                    numeradorResultado =  (n1*d2 + n2*d1) ;
                    denominadorResultado = (d1*d2);
                    System.out.println(produzirSaida(numeradorResultado,denominadorResultado));
                }
                case "-" ->{
                    numeradorResultado =  (n1*d2 - n2*d1) ;
                    denominadorResultado = (d1*d2);
                    System.out.println(produzirSaida(numeradorResultado,denominadorResultado));
                }
                case "*"->{
                    numeradorResultado =  (n1*n2) ;
                    denominadorResultado = (d1*d2);
                    System.out.println(produzirSaida(numeradorResultado,denominadorResultado));
                }
                case "/"->{
                    numeradorResultado =  (n1*d2) ;
                    denominadorResultado = (n2*d1);
                    System.out.println(produzirSaida(numeradorResultado,denominadorResultado));
                }
            }


        }



    }

    public static String produzirSaida(Integer numerador, Integer denominador){
        String primeiroRacional = "" + numerador + "/" + denominador;
        Integer numeradorReduzido = numerador;
        Integer denominadorReduzido = denominador;

        for (int i = 1; i <= 100; i++) {
            if(numeradorReduzido % i == 0 && denominadorReduzido % i == 0){
                numeradorReduzido /= i;
                denominadorReduzido /= i;
                i=1;
            }
        }
        String segundoRacional = "" + numeradorReduzido + "/" + denominadorReduzido;
        return  primeiroRacional  + " = " + segundoRacional;
    }

}
