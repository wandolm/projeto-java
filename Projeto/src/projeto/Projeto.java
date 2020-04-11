/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author wando
 */
public class Projeto {
    
    static void meuNome(String n){
        
        System.out.println("Hello " + n + "!");                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Seu nome: ");
        String n = ler.nextLine();
        meuNome(n);               
        
        idade();
    }
    
    public static void  idade(){
        int idade=0;
        
        System.out.println("Informe sua idade");
        	
        Scanner in = new Scanner(System.in);
        idade = in.nextInt();
        
        System.out.println("Sua idade é : "+ idade);
        
    }
}
