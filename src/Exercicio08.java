import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
//        8 - Escreva um programa que crie um vetor de inteiros e preencha com valores aleatórios. Em seguida,
//        o program deve identificar a maior sequencia de valores consecutivos iguais presentes no vetor e exibir a posição inicial
//        e a final da sequencia

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja inserir na lista: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        Random rand = new Random();
        int ultimoNumero = 0;
        int totalLista = 0;
        int ultimoIndex = 0;

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(10);
            vect[i] = num;
            if (i == 0) { ultimoNumero = num; }

            if (num == ultimoNumero + 1){
                totalLista++;
                ultimoIndex = i;
            } else{
                ultimoNumero = num;
            }
        }

        for(int num:vect) {
            System.out.print(num+" ");
        }



        System.out.println();
        System.out.println("Ultimo numero da lista completa: "+ultimoNumero);
        System.out.println("Total de numeros em sequencia: "+(totalLista+1));
        System.out.println("Ultimo index da sequencia: "+ultimoIndex);

        int primeiroIndex = 0;
        for(int i = 0;i < ultimoIndex +1;i++){
            primeiroIndex = i;
        }

        System.out.println("Primeiro index da sequencia: "+(primeiroIndex - 1));
        sc.close();


    }
}
