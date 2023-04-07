import java.util.*;

public class Exercicio12 {
    public static void main(String[] args) {
//        12 - Biblioteca de música: Desenvolva um programa com ArrayList para gerenciar uma biblioteca de música.
//                Os usuários devem ser capazes de adicionar novas músicas, remover músicas existentes, pesquisar músicas por titulo, artista e exibir a biblioteca

        List<String[]> musicas = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nO que você deseja fazer?" +
                    "\n[1] Adicionar Musica" +
                    "\n[2] Remover musica" +
                    "\n[3] Pesquisar por artista" +
                    "\n[4] Pesquisar por título" +
                    "\n[5] Exibir biblioteca");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    String[] musica = new String[2];
                    System.out.println("\nArtista: ");
                    sc.nextLine();

                    String newArtista = sc.nextLine().toUpperCase();

                    System.out.println("\nTítulo: ");
                    String newMusic = sc.nextLine().toUpperCase();

                    musica[0] = newArtista;
                    musica[1] = newMusic;
                    musicas.add(musica.clone());
                    break;

                case 2:
                    System.out.println("\nQual o id da musica qual deseja remover? ");
                    int removeId = sc.nextInt();
                    musicas.remove(removeId - 1);
                    System.out.println("Musica removida com sucesso");
                    break;

                case 3:
                    System.out.println("\nQual o nome do artista? ");
                    sc.nextLine();
                    String artistaName = sc.nextLine().toUpperCase();
                    int idMusicArtist = 0;
                    for (String[] musicArtist:musicas){
                        if (musicArtist[0].contains(artistaName)){
                            System.out.printf("ID: %d - Artista: %s - Título: %s",(idMusicArtist+1),musicArtist[0], musicArtist[1]);
                            System.out.println();
                        }
                        idMusicArtist++;
                    }
                    break;

                case 4:
                    System.out.println("\nQual o titulo da musica? ");
                    sc.nextLine();
                    String musicTitle = sc.nextLine().toUpperCase();
                    int idTitleMusic = 0;
                    for (String[] musics:musicas){
                        if (musics[1].contains(musicTitle)){
                            System.out.printf("ID: %d - Artista: %s - Título: %s",(idTitleMusic+1),musics[0], musics[1]);
                            System.out.println();
                        }
                        idTitleMusic++;
                    }
                    break;

                case 5:
                    int id = 0;
                    for(String[] music:musicas){
                        System.out.printf("ID: %d - Artista: %s - Título: %s",(id+1),music[0], music[1]);
                        System.out.println();
                        id++;
                    }
                    break;
            }

        }
    }
}
