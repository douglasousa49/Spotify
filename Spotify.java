/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotify;

/**
 *
 * @author douglas.ssilva72
 */
public class Spotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {

            System.out.println("===== MENU =====");
            System.out.println("1 - Adicionar Musica");
            System.out.println("2 - Listar Musicas");
            System.out.println("3 - Tocar Proxima");
            System.out.println("0 - Sair");
            
            EntradaDados entrada = new EntradaDados();
            ListaReproducao lista = new ListaReproducao();
            Musica musica = new Musica();

            int escolha = entrada.lerInt();

            switch (escolha) {

                case 1:
                    
                    System.out.println("Qual o nome da musica: ");
                    musica.nome = entrada.lerTexto();
                    
                    System.out.println("Qual o nome do artista: ");
                    musica.artista = entrada.lerTexto();
                    
                    System.out.println("Qual o codigo do YouTube: ");
                    musica.codYoutube = entrada.lerTexto();
                    
                    lista.adicionar(musica);
                    
                    break;

                case 2:
                    
                    lista.listar();
                    
                    break;

                case 3:
                    
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Escolha invalida.");
            }
        }
    }
}