package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Media3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] entry = bf.readLine().split(" ");
        double n1 = Double.parseDouble(entry[0]), n2 = Double.parseDouble(entry[1]) , n3 = Double.parseDouble(entry[2]), n4 = Double.parseDouble(entry[3]);
        double media = (n1*2 + n2*3 + n3*4 + n4*1) / (2+3+4+1);
        String situacao = "";
        boolean exame = false;

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0",symbols);
        df.setRoundingMode(java.math.RoundingMode.DOWN);
        System.out.printf("Media: %s\n", df.format(media));
        if(media < 4.9){
            situacao = "Aluno reprovado.";
        }else if(media >= 7.0){
            situacao = "Aluno aprovado.";
        }else{
            situacao = "Aluno em exame.";
            exame = true;
        }

        System.out.println(situacao);
        if(exame){
            situacao = "Aluno reprovado";
            double ntExame = Double.parseDouble(bf.readLine());
            System.out.printf("Nota do exame: %s\n", ntExame);
            media = (media + ntExame) / 2;
            if(media>=5.0){
                situacao = "Aluno aprovado.";
            }
            System.out.println(situacao);
            System.out.printf("Media final: %s\n", df.format(media));
        }

    }
}
