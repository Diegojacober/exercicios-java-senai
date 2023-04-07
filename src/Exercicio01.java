import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
//        1 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitafos pelo usuário.
//                Em seguida, o programa deve exibir o valor médio dos números armazenados no vetor.

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+": ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum/n;

        System.out.printf("Average: %.2f%n", avg);

        sc.close();
    }
}
