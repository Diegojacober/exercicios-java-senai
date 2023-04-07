import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
//        10 - Lista de contatos: Um programa que permita aos usuários manter uma lista de contatos usando um ArrayList.
//        Os usuários devem ser capazes de adicionar novos contatos, remover, pesquisar e exibir a lista.

        List<String> contatos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Contato" +
                    "\n[2] Remover Contato" +
                    "\n[3] Pesquisar Contato" +
                    "\n[4] Exibir todos os contatos");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDigite o numero do contato: ");
                    String novoContato = sc.next();
                    contatos.add(novoContato);
                    break;

                case 2:
                    System.out.println("\nDigite o id qual deseja remover: ");
                    int removeContato = sc.nextInt();
                    contatos.remove(removeContato-1);
                    break;

                case 3:
                    System.out.println("\n Digite o numero qual deseja pesquisar: ");
                    String searchContato = sc.next();
                    int search = contatos.indexOf(searchContato);
                    if (search != -1){
                        System.out.printf("\n O contato procurado tem o id %d \n",search+1);
                    } else {
                        System.out.println("\n Contato não encontrado");
                    }
                    break;

                case 4:
                    for(int i = 0; i < contatos.size();i++){
                        System.out.printf("ID: %d - %s \n",i+1,contatos.get(i));
                    }
                    break;
            }
        }

    }

}
