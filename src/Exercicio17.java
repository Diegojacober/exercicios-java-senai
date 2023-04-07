import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
//        17 - Carrinho de compras: Crie um programa que use ArryaList para implementar um carrinho de compras simples. Os usuários
//        devem ser capazes de adicionar itens ao carrinho, calcular preço total dos itens e exibir os itens do carrinho.

        List<String[]> carrinho = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar item" +
                    "\n[2] Remover item" +
                    "\n[3] Calcular total" +
                    "\n[4] Exibir todos os itens");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    String[] newitem = new String[2];
                    System.out.println("\nNome do item: ");
                    sc.nextLine();

                    String newNome = sc.nextLine().toUpperCase();

                    System.out.println("\nPreço: ");
                    String newPreco = sc.nextLine();

                    newitem[0] = newNome;
                    newitem[1] = newPreco;
                    carrinho.add(newitem.clone());
                    break;

                case 2:
                    System.out.println("\nQual o id do produto qual deseja remover? ");
                    int removeId = sc.nextInt();
                    carrinho.remove(removeId - 1);
                    System.out.println("Item removido com sucesso");
                    break;

                case 3:
                    double total = 0.00;
                    sc.nextLine();
                    int idFuncionarioName = 0;
                    for (String[] item:carrinho){
                        double preco = Double.parseDouble(item[1]);
                        total+= preco;
                    }
                    System.out.printf("\n O total do carrinho é R$ %.2f",total);
                    break;


                case 4:
                    int id = 0;
                    for(String[] item:carrinho){
                        System.out.printf("ID: %d - Nome: %s - Preço: 2%s",(id+1),item[0], item[1]);
                        System.out.println();
                        id++;
                    }
                    break;
            }

        }
    }
}
