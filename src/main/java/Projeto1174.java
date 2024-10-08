import java.util.Scanner;

public class Projeto1174 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float X[] = new float[100];

        for (int i = 0; i < 100; i++) {
            X[i] = leitor.nextFloat();
            if (X[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, X[i]);

            }
        }
    }
}
