/*
* Pergunte do usuário quantos números ele deseja ler, conte quantos foram pares e ímpares.
* */

package loopsEArrays;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros deseja ler?");
        int numberCount = Integer.valueOf(scan.nextLine());
        int i = 0,  // To control the loop
            evenCount = 0,
            oddCount = 0;

        do {
            System.out.println("Insira um número: ");
            double num = Double.valueOf(scan.nextLine());

            if (num % 2 == 0) {
                evenCount++;
            }

            oddCount++;
            i++;
        } while (i < numberCount);


        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

    }
}
