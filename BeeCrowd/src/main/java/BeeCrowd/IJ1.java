package BeeCrowd;

public class IJ1 {
    public static void main(String[] args) {
            int j = 60;
            for (int i = 1; i < 900; i+= 3) {
            System.out.println("I=" +i+ " J=" +j);
            j -= 5;
            if(j == -5) break;
        }
    }
}
