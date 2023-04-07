import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
//        5 - Escreva um programa que crie um vetor de inteiros e preencha com valores aleatórios. Em seguida, o programa
//        deve criar um segundo vetor com os mesmos valores do primeiros vetor, porém na ordem inversa, Por fim,
//                o programa deve exibir os dois vetores

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja que sejam inseridos: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int[] vectInverso = new int[n];
        int count = n;

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(0,100);
            vect[i] = num;
        }


        for (int i = 0; i < n; i ++){
            vectInverso[i] = vect[count-1];
            count -= 1;
        }


        for (int i = 0; i < n; i ++) {
            System.out.printf("%d \n", vectInverso[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i ++) {
            System.out.printf("%d ", vect[i]);
        }

        sc.close();
    }
}
