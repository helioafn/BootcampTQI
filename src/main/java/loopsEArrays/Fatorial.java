/*
* Escreva um programa que leia um inteiro do usuário e imprima o fatorial desse número.
* */

package loopsEArrays;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        long num = Integer.valueOf(scan.nextLine());
        long fatorial = 1;

        if (num == 0) {
            System.out.println("Fatorial de " + num + " é 1.");
            return;
        }

        if (num == 1) {
            System.out.println("Fatorial de " + fatorial + " é 1.");
            return;
        }

        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + " é " + fatorial);

        /*
        * 1x2x3x4x5 = 120 */
    }
}
