/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author douglas.ssilva72
 */
public class ListaReproducao {
    
    private Stack<Musica> itens = new Stack<>();
    
    public void adicionar(Musica musica){
        itens.push(musica);        
    }
    
    public void listar(){
        
            System.out.println("===== PlayList =====");
            System.out.println();
            
            int i=itens.size();
            
            for (Musica item : itens) {
              System.out.println(i+ " " + item);
              i--;
        }
    }
    
    public void tocarProxima() throws IOException{
        
        itens.pop();
        Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:http://www.youtube.com/");
        
    }   
}