package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PositivosEMedia {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        List<Double> positivos = new ArrayList<>();
        double total = 0;
        for (int i = 0; i < 6; i++) {
            Double n = Double.parseDouble(bf.readLine());
            if(n > 0){
                positivos.add(n);
                total += n;
            }
        }

        DecimalFormat format = new DecimalFormat("##.#");
        format.setRoundingMode(RoundingMode.HALF_EVEN);

        String media = format.format(total/positivos.size()).replace(",",".");

        System.out.println(positivos.size() +" valores positivos");
        System.out.println(media);

    }
}
