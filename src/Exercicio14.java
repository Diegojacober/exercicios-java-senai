import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio14 {
    public static void main(String[] args) {
//        14 - Matrícula de estudantes: Crie um programa que use um set para acompanhar estudantes matriculados em um curso.
//        Implemente operações como adicionar novos estudantes, remover estudantes, verificar se um estudantes está matriculado e exibir a lista de estudantes

        Set<String> alunos = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar aluno" +
                    "\n[2] Remover aluno" +
                    "\n[3] Verificar aluno" +
                    "\n[4] Exibir todos os alunos" +
                    "\n[5] Total de alunos");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDigite o nome do aluno: ");
                    String novoAluno = sc.next().toUpperCase();
                    alunos.add(novoAluno);
                    System.out.println("\nAluno adicionado");
                    break;

                case 2:
                    System.out.println("\nDigite o aluno qual deseja remover: ");
                    String removeAluno = sc.next().toUpperCase();
                    boolean exists = alunos.contains(removeAluno);
                    if (exists){
                        alunos.remove(removeAluno);
                        System.out.println("\nAluno removido");
                    } else {
                        System.out.println("\nO aluno escolhido não existe");
                    }
                    break;

                case 3:
                    System.out.println("\n Digite o seguidor qual deseja verificar: ");
                    String verifyAluno = sc.next().toUpperCase();
                    boolean existsAluno = alunos.contains(verifyAluno);
                    if (existsAluno){
                        System.out.println("\nO aluno existe na lista");
                    } else {
                        System.out.println("\nO aluno não existe na lista");
                    }
                    break;

                case 4:
                    for(String aluno:alunos){
                        System.out.printf("\n %s",aluno);
                    }
                    break;
                case 5:
                    System.out.printf("\nExistem no total %d alunos",alunos.size());
                    break;
            }
        }
    }
}
