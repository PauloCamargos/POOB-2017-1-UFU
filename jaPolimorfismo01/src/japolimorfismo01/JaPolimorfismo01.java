/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo01;

/**
 *
 * @author paulo
 */
public class JaPolimorfismo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal bicho[] = new Animal[2];
        
        bicho[0] = new Gato("Xanim", "Preto", 3);
        bicho[1] = new Cachorro("Auau", "Marrom", 10, 2);
        
        for(int i=0; i<bicho.length; i++){
            System.out.println("Nome: " + bicho[i].getNome());
            System.out.println("Cor: " + bicho[i].getCor());
            System.out.println("Peso: " + bicho[i].getPeso() + " Kg");
            System.out.println("Tipo de comida: " + bicho[i].tipoComida());
            System.out.println("==== ===== ==== ===== ===== =====");
        }
    }  
}
