package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ajude {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bf.readLine());
        while (cases != 0){
            List<String> entries = new ArrayList<>();
            for (int i = 0; i < cases; i++) {
                entries.add(bf.readLine());
            }
            long correctCount =  entries.stream().filter(e -> e.split(" ")[2].equals("correct")).count();
            int sum = 0;
            String correctChars = "";
            for (String entrada: entries) {
                if(entrada.split(" ")[2].equals("correct")){
                    correctChars += entrada.split(" ")[0];
                    sum += Integer.parseInt(entrada.split(" ")[1]);
                }
            }
            for (String entrada: entries) {
                if(entrada.split(" ")[2].equals("incorrect") && correctChars.contains(entrada.split(" ")[0]) ){
                    sum += 20;
                }
            }
            System.out.println(correctCount +" " +sum);
            cases = Integer.parseInt(bf.readLine());
        }

    }
}
