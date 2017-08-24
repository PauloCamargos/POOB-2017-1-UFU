/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio;

/**
 *
 * @author paulo
 */
public class JaLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // CALCULOS COM VETOR 3D
//        // TODO code application logic here
//        Vetor2D u = new Vetor2D(4,3);
//        Vetor2D v = new Vetor2D(1,2); 
//        Vetor2D vetor_projecao;
//        
//        //Mostra coordenadas dos objetos Vetor2D criados:
//        System.out.println("x,y de u: " + u.getX() + "," + u.getY());
//        System.out.println("x,y de v: " + v.getX() + "," + v.getY());
//        
//        //Calcula o produto escalar dos vetores:
//        System.out.println("PE de u: " + u.produtoEscalar(v));
//        
//        // Calcula o modulo dos vetores
//        System.out.println("Módulo de u: " + u.moduloVetor());
//        System.out.println("Módulo de v: " + v.moduloVetor());
//        
//        //Calcula o angulo entre os vetores:
//        System.out.println("Angulo entre u e v: " + u.angulo(v));
//        
//        //Calculo vetor projeção
//        vetor_projecao = v.projecao(u); // Retorna projecao de v sobre u
//        System.out.println("x de vetor_projecao: " + vetor_projecao.getX());
//        System.out.println("y de vetor_projecao: " + vetor_projecao.getY());
//        
//        System.out.println("x,y de u: " + u.getX() + "," + u.getY());
//        System.out.println("x,y de v: " + v.getX() + "," + v.getY());
               
        // CALCULOS COM VETOR 3D
        System.out.println("------ CALCULOS COM VETOR 3D ------");
        
        Vetor3D u = new Vetor3D(1,2,3);
        Vetor3D v = new Vetor3D(4,5,6);
        //Vetor3D PV = new Vetor3D();
        
        System.out.println("Modulo de u: " + u.moduloVetor());
        System.out.println("Modulo de v: " + v.moduloVetor());
        
        Vetor3D PV = u.produtoVetorial(v);
        System.out.println("Produto Vetorial u x v: ");
        System.out.println("X = " + PV.getX());
        System.out.println("Y = " + PV.getY());
        System.out.println("Z = " + PV.getZ());
        
    }
    
}
