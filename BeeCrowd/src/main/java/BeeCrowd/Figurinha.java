package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Figurinha {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int cases = Integer.parseInt(in.readLine());


        List<Integer> outputs = new ArrayList<>();
        for (int i = 0; i < cases; i++) {

        String[] entry = in.readLine().split(" ");
        int entry1 = Integer.parseInt(entry[0]);
        int entry2 = Integer.parseInt(entry[1]);

        outputs.add(mdc(entry1,entry2));
        }
        for (int output: outputs) {
            System.out.println(output);
        }
    }

    public static int mdc(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return mdc(num2, num1 % num2);
    }
}
