import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio18 {
    public static void main(String[] args) {
//        18 - Confirmação de RSVP de evento: Construe um programa que use um set para acompanhar as confirmações de RVSP de um evento.
//        Implemente funções como adicionar confirmações, remover e verificar confirmação e exibir a lista.


        Set<String> rsvps = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar RSVP" +
                    "\n[2] Remover RSVP" +
                    "\n[3] Verificar RSVP" +
                    "\n[4] Exibir todos os RSVP");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDigite o nome do RSVP: ");
                    String novoRsvp = sc.next().toUpperCase();
                    rsvps.add(novoRsvp);
                    System.out.println("\nRSVP adicionado");
                    break;

                case 2:
                    System.out.println("\nDigite o RSVP  qual deseja remover: ");
                    String removerRsvp = sc.next().toUpperCase();
                    boolean exists = rsvps.contains(removerRsvp);
                    if (exists){
                        rsvps.remove(removerRsvp);
                        System.out.println("\nRSVP removido");
                    } else {
                        System.out.println("\nO RSVP escolhido não existe");
                    }
                    break;

                case 3:
                    System.out.println("\n Digite o RSVP qual deseja verificar: ");
                    String verifyRvsp = sc.next().toUpperCase();
                    boolean existsRvsp = rsvps.contains(verifyRvsp);
                    if (existsRvsp){
                        System.out.println("\nO RSVP existe na lista");
                    } else {
                        System.out.println("\nO RSVP não existe na lista");
                    }
                    break;

                case 4:
                    for(String rsvp:rsvps){
                        System.out.printf("\n%s",rsvp);
                    }
                    break;
            }
        }
    }
}
