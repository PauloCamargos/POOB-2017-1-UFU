/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaretangulo;

/**
 *
 * @author paulo
 */
public class JaRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        // Criando dois objetos da classe Retangulo:
        Retangulo r1 = new Retangulo();     // Cira um objeto de um ret.
                                                // chamado r1
        Retangulo r3 = new Retangulo(4.0);
        Retangulo r2 = new Retangulo(7.0, 3.0);
        
        System.out.println("Área do objeto r1: " + r1.areaRet()); //executa o
                                                        // metodo areaRet em r1
        System.out.println("Área do objeto r2: " + r2.areaRet());
        System.out.println("Área do objeto r3: " + r3.areaRet());
        
        r1.setBase(5.0);     // Configura (set) o valor de base como 5 atraves 
                                // do método setBase()
        r1.setAltura(4.0);
        
        //========== AREA =============================
        System.out.println("Área do objeto r1: " + r1.areaRet()); //executa o
                                                        // metodo areaRet em r1
        System.out.println("Área do objeto r2: " + r2.areaRet());
        
        //============= BASE / ALTURA===================
        System.out.println("A base do objeto r1: " + r1.getBase());  // retorna 
                                    // o valor da base configurado em r1 através
                                    // do método getBase()
        System.out.println("A altura do objeto r2: " + r2.getAltura());
        //========== PERIMETRO =====================================
        System.out.println("O perimetro do objeto r1: " + r1.perimetro());
        System.out.println("O perimetro do objeto r2: " + r2.perimetro());
        System.out.println("O perimetro do objeto r3: " + r3.perimetro());
       
    }
    
}
