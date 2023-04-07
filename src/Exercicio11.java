import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio11 {
    public static void main(String[] args) {
//        11 - Seguidores de midia social: Um progrma que use um set para acompanhar seguidores de uma conta de mídia social.
//                Implemente operações como adicionar seguidores, remover, verificar existencia e exibir o numero de total de seguidores

        Set<String> seguidores = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Seguidor" +
                    "\n[2] Remover seguidor" +
                    "\n[3] Verificar seguidor" +
                    "\n[4] Exibir todos de seguidores" +
                    "\n[5] Total de seguidores");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDigite o nome do seguidor: ");
                    String novoSeguidor = sc.next();
                    seguidores.add(novoSeguidor);
                    System.out.println("\nSeguidor adicionado");
                    break;

                case 2:
                    System.out.println("\nDigite o seguidor qual deseja remover: ");
                    String removeSeguidor = sc.next();
                    boolean exists = seguidores.contains(removeSeguidor);
                    if (exists){
                        seguidores.remove(removeSeguidor);
                        System.out.println("\nSeguidor removido");
                    } else {
                        System.out.println("\nO seguidor escolhido não existe");
                    }
                    break;

                case 3:
                    System.out.println("\n Digite o seguidor qual deseja verificar: ");
                    String verifyFollower = sc.next();
                    boolean existsFolower = seguidores.contains(verifyFollower);
                    if (existsFolower){
                        System.out.println("\nO Seguidor existe na lista");
                    } else {
                        System.out.println("\nO seguidor não existe na lista");
                    }
                    break;

                case 4:
                    for(String seguidor:seguidores){
                        System.out.printf("\n %s",seguidor);
                    }
                    break;
                case 5:
                    System.out.printf("\nExistem no total %d seguidores",seguidores.size());
                    break;
            }
        }
    }
}
