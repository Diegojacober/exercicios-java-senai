import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
//        2 - Escreva um programa que crie um vetor de inteiros e preencha com valores aleatórios. Em seguida o programa deve
//        exibir o maior e o menor valor presente no vetor.
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(0,25);
            vect[i] = num;
            if (i == 0){
                maior = num;
                menor = num;
            } else if (num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
        }

        for (int item:vect){
            System.out.println(item);
        }

        System.out.println("O maior numero é: "+maior);
        System.out.println("O menor numero é: "+menor);
        sc.close();
    }
}
