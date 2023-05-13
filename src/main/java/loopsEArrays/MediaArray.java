/*
* Leia 5 números do usuário, imprima o maior deles e a média dos números.
* */
package loopsEArrays;
import java.util.Scanner;
public class MediaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[5];
        int i = 0;

        do {
            System.out.println("Insira um número:");
            numbers[i] = Double.valueOf(scan.nextLine());
            i++;
        } while (i < 5);

        i = 0;
        double greatest = numbers[0];
        double sum = 0;
        while (i < numbers.length) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }

            sum += numbers[i];
            i++;
        }

        double average = sum / (numbers.length * 1.0);

        System.out.println("Greatest: " + greatest);
        System.out.println("Average: " + average);
    }
}
