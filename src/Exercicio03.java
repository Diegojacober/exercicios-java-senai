import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
//        3 - Escreva um programa que crie dois vetores de inteiros do mesmo tamanho e preencha com valores digitados.
//                Em seguida, o programa deve calcular e exibir a soma dos valores presentes em cada posição dos vetores, ou seja, somar a posição 0 de um vetor,
//                com a posição 0 de outro vetor, assim por diante e apresentar para o usuário.

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar em cada um dos vetores: ");
        int n = sc.nextInt();
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+" do primeiro vetor: ");
            vect1[i] = sc.nextInt();

            System.out.print("Valor "+(i+1)+" do segundo vetor: ");
            vect2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int num1 = vect1[i];
            int num2 = vect2[i];

            System.out.printf("Valor na posição %d: %d + %d = %d \n",i,num1,num2,(num1 + num2));
        }

        sc.close();

    }
}
