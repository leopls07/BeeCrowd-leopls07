package BeeCrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class SortSimples {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] entrys = in.readLine().split(" ");

        ArrayList<Integer> list = new ArrayList<>();
        for (String entry : entrys) {
            list.add(Integer.parseInt(entry));
        }
        list.sort(Comparator.naturalOrder());


        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();

        for (String joao:entrys) {
            System.out.println(joao);
        }
    }
}
