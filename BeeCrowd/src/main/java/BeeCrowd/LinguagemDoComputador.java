package BeeCrowd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;
public class LinguagemDoComputador {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        for (int i = 0; i < 4; i++) {
            int q;
            Stream<Integer> acessoStream = Arrays.stream(b.readLine().split(" ")).map(Integer::parseInt);
            q = acessoStream.mapToInt(e -> e).sum();
            if(q>m){
                m = q;
            }
        }
        System.out.printf("%d = %s\n",m, Integer.toBinaryString(m));
    }
}
