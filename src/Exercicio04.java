import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
//        4 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário. Em seguida, o programa
//        deve ordenar o vetor em ordem crescente e exibir os valores ordenados.

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+": ");
            vect[i] = sc.nextInt();

        }

        Arrays.sort(vect);
        System.out.println("Vetor ordenado");
        for (int item:vect){
            System.out.printf("%d \n",item);
        }

        sc.close();
    }
}
