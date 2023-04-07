import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
//        7 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
//                Em seguida, o programa deve dividir o vetor em dois, um contendo os valores pares e outro contendo os valores impares.
//        Por fim, o programa deve exibir os dois vetores resultantes

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int total = 0;
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+": ");
            int num = sc.nextInt();
            vect[i] = num;
            if (num % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        int[] numPares = new int[totalPares];
        int[] numImpares = new int[totalImpares];
        int cont = 0;
        int cont2 = 0;
        for (int num:vect) {
            if (num % 2 == 0){
                numPares[cont] = num;
                cont++;
            } else {
                numImpares[cont2] = num;
                cont2++;
            }
        }

        System.out.println("Números pares: ");
        for (int par:numPares){
            System.out.print(par+" ");
        }

        System.out.println("Números impares: ");
        System.out.println();
        for (int impar:numImpares){
            System.out.print(impar+" ");
        }

        sc.close();
    }
}
