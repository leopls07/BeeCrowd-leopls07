package BeeCrowd;

public class IJ3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("I=%d J=%d\n",i,i+7-j);
            }
        }
    }
}
