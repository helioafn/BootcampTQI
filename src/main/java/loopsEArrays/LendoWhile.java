/*
* Leia um valor entre 0 e 10 que representa uma nota, caso o valor seja invalido
* exiba uma mensagem e leia novamente um numero.
* */

package loopsEArrays;
import java.util.Scanner;

public class LendoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira sua nota:");
            double nota = Double.valueOf(scanner.nextLine());

            if (!(nota >= 0 && nota <= 10)) {
                System.out.println("Valor invalido, tente novamente");
                continue;
            } else {
                break;
            }
        }
    }
}
