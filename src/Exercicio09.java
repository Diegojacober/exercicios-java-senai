import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

//        9 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
//        Em seguida, o programa deve identificar a quantidade de subvetores crescentes presentes no vetor e exibir o número
//        de subvetores encontrados.

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+": ");
            vect[i] = sc.nextInt();
        }

        int ultimoNumero = 0;
        for(int i = 0; i < n;i++){
            if (i == 0){ ultimoNumero = vect[i]; }
            if (ultimoNumero+1 == vect[i]){
                System.out.print(vect[i]+" ");
            } else {
                ultimoNumero = vect[i];
            }
        }

    }
}
