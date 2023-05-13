/*
* Leia 6 caracteres do usuário e ao final exiba o número de consoantes inseridos.
* */

package loopsEArrays;
import java.util.Scanner;

public class ChecaConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] chars = new String[6];
        int consoantes = 0;

        for (int i = 0; i < chars.length; i++) {
            System.out.println("Insira um caractere:");
            String input = scan.nextLine();

            if (!(input.equalsIgnoreCase("a")
                    || input.equalsIgnoreCase("e")
                    || input.equalsIgnoreCase("i")
                    || input.equalsIgnoreCase("o")
                    || input.equalsIgnoreCase("u"))) {
                consoantes++;
            }
        }

        System.out.println("Foram lidas " + consoantes + " consoantes.");
    }
}
