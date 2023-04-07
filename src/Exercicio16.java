import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
//        16 - Inventário de livros: Desenvolva um programa que use um Map para armazenar informações de livros, incluindo títulos como chaves e seus respectivos autores.
//        Adicionar, atualizar, pesquisar e exibir todos.

        Map<String, String> livros = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Livro" +
                    "\n[2] Atualizar Livro" +
                    "\n[3] Pesquisar Livro" +
                    "\n[4] Exibir todos os livros");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nTitulo do livro: ");
                    sc.nextLine();

                    String newTitle = sc.nextLine().toUpperCase();

                    System.out.println("\nAutor: ");
                    String newAuthor = sc.nextLine();

                    livros.put(newTitle,newAuthor);
                    break;

                case 2:
                    System.out.println("\nDigite o livro qual deseja atualizar o autor: ");
                    sc.nextLine();
                    String updateTitle = sc.nextLine().toUpperCase();

                    String updateAuthor = livros.get(updateTitle);

                    System.out.println("\nNovo nome do livro: ");
                    String newTitulo = sc.nextLine();

                    System.out.println("\nNovo nome do autor: ");
                    String newAutor = sc.nextLine();

                    livros.remove(updateTitle,updateAuthor);
                    livros.put(newTitulo,newAutor);

                    break;

                case 3:
                    System.out.println("\nDigite o livro qual deseja pesquisar: ");
                    sc.nextLine();
                    String livroSearch = sc.nextLine().toUpperCase();
                    if(livros.containsKey(livroSearch)){
                        System.out.printf("Livro: %s, Autor: %s \n", livroSearch,livros.get(livroSearch));
                    } else{
                        System.out.println("Livro não encontrado no sistema");
                    }

                    break;

                case 4:
                    for(String valor : livros.keySet()){
                        System.out.printf("Livro: %s, Autor: %s \n", valor,livros.get(valor));
                    }
                    break;
            }
        }
    }
}
