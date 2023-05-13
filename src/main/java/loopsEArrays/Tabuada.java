/*
* Leia um número do usuário, imprima a tabuada até 10 de tal número
* ex: 10 -> 10x1 = 10, 10x2 = 20 ... 10x10 = 100
* */

package loopsEArrays;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número que quer consultar a tabuada:");
        int num = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
