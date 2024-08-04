package BeeCrowd;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class IJ4 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.#");
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        for (double i = 0; i <= 2; i += 0.2) {
            double formattedI = Double.parseDouble(format.format(i).replace(",", "."));
            for (double j = 1; j <= 3; j++) {
                String formatStringI = (formattedI % 1 == 0) ? "%.0f" : "%.1f";
                String formatStringJ = ((j+i) % 1 == 0) ? "%.0f" : "%.1f";
                System.out.printf("I=" + formatStringI + " J=" + formatStringJ + "\n", formattedI, j + formattedI);
            }
        }
    }
}