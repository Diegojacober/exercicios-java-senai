import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
//        13 - Avaliações de filmes: Construa um programa que use um Map para armazenar avaliações de filmes fornecidas, pelos usuários.
//                Implemente funções como adicionar avaliações, atualizar existentes, calcular avaliações médias e exibir os filmes mais bem avaliados

        // titulo do filme, avaliação
        Map<String, Integer> avaliacoes = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Avaliação" +
                    "\n[2] Atualizar Avaliação" +
                    "\n[3] Avaliações medias dos filmes" +
                    "\n[4] Exibir filmes mais bem avaliados" +
                    "\n[5] Exibir filmes e avaliações");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nTitulo do filme: ");
                    sc.nextLine();

                    String newTitle = sc.nextLine().toUpperCase();

                    System.out.println("\nAvaliação de 0 a 5: ");
                    int newRating = sc.nextInt();

                    avaliacoes.put(newTitle,newRating);
                    break;

                case 2:
                    System.out.println("\nDigite o filme qual deseja atualizar a avaliação: ");
                    sc.nextLine();

                    String updateTitle = sc.nextLine().toUpperCase();
                    Integer avaliacao = avaliacoes.get(updateTitle);
                    System.out.println("\nAvaliação de 0 a 5: ");
                    int newAvaliacao = sc.nextInt();

                    avaliacoes.remove(updateTitle,avaliacao);
                    avaliacoes.put(updateTitle,newAvaliacao);

                    break;

                case 3:
                    int total = 0;
                    for(String valor : avaliacoes.keySet()){
                        total += avaliacoes.get(valor);
                    }
                    System.out.printf("\n a média de avalições é %d",(total/avaliacoes.size()));
                    break;

                case 4:
                    for(String valor : avaliacoes.keySet()){
                        if (avaliacoes.get(valor) == 5 || avaliacoes.get(valor) == 4 ){
                            System.out.printf("Filme: %s, Avaliação: %d \n", valor,avaliacoes.get(valor));
                        }
                    }
                    break;

                case 5:

                    for(String valor : avaliacoes.keySet()){
                        System.out.printf("Filme: %s, Avaliação: %d \n", valor,avaliacoes.get(valor));
                    }
                    break;
            }
        }
    }
}
