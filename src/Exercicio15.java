import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
//        15 - Banco de dados de funcionários: Construa um programa que use um ArrayList para gerenciar informações de funcionáriosm
//        nomes, IDs e salários, adicionar funcionarios, pesquisar e exibir todos

        List<String[]> funcionarios = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Funcionário" +
                    "\n[2] Remover Funcionário" +
                    "\n[3] Pesquisar Funcionário" +
                    "\n[4] Exibir todos os funcionários");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    String[] NewFuncionario = new String[2];
                    System.out.println("\nNome do funcionário: ");
                    sc.nextLine();

                    String newNome = sc.nextLine().toUpperCase();

                    System.out.println("\nSalário: ");
                    String newSalario = sc.nextLine();

                    NewFuncionario[0] = newNome;
                    NewFuncionario[1] = newSalario;
                    funcionarios.add(NewFuncionario.clone());
                    break;

                case 2:
                    System.out.println("\nQual o id do funcionário qual deseja remover? ");
                    int removeId = sc.nextInt();
                    funcionarios.remove(removeId - 1);
                    System.out.println("Funcionário removido com sucesso");
                    break;

                case 3:
                    System.out.println("\nQual o nome do funcionário? ");
                    sc.nextLine();
                    String funcionarioName = sc.nextLine().toUpperCase();
                    int idFuncionarioName = 0;
                    for (String[] funcionarioSearch:funcionarios){
                        if (funcionarioSearch[0].contains(funcionarioName)){
                            System.out.printf("ID: %d - Nome: %s - Salário: %s",(idFuncionarioName+1),funcionarioSearch[0], funcionarioSearch[1]);
                            System.out.println();
                        }
                        idFuncionarioName++;
                    }
                    break;


                case 4:
                    int id = 0;
                    for(String[] functionario:funcionarios){
                        System.out.printf("ID: %d - Nome: %s - Salário: %s",(id+1),functionario[0], functionario[1]);
                        System.out.println();
                        id++;
                    }
                    break;
            }

        }
    }
}
