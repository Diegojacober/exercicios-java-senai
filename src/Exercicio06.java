import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
//        6 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
//                Em seguida, o programa deve remover todos os valores iguais a zero e exibir os valores restantes.

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        String numeros = "";
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Valor "+(i+1)+": ");
            vect[i] = sc.nextInt();

        }

        for(int item:vect){
            if (item != 0){
                String num = String.valueOf(item);
                numeros += num+" ";
                total++;
            }
        }

        int[] vect2 = new int[total];
        String array[] = new String[total];
        array = numeros.split(" ");

        for(int i=0; i < total; i++) {
            int num = Integer.parseInt(array[i]);
            vect2[i] = num;
        }

        for(int item:vect2){
            System.out.println(item);
        }

        sc.close();
    }
}
