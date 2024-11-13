/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

import java.util.Scanner;

/**
 *
 * @author douglas.ssilva72
 */
public class EntradaDados {
    
    static Scanner ler = new Scanner(System.in);
    
    public String lerTexto() {
        return ler.nextLine();
    }
    
    public int lerInt() {

        while (true) {
            var linha = ler.nextLine();
            try {
                return Integer.parseInt(linha);
                
            } catch (NumberFormatException erro) {

                System.out.println("Digite um número inteiro.");
            }
        }
    }    
}