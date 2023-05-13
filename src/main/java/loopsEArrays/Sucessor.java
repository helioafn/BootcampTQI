/*
* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
* Ao final, mostre os números e seus sucessores.
* */

package loopsEArrays;
import java.util.Random;

public class Sucessor {
    public static void main(String[] args) {
        Random randGenerator = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randGenerator.nextInt(100);
        }

        for (int number :
                numbers) {
            System.out.println(number +  " " + (++number));
        }
    }
}
