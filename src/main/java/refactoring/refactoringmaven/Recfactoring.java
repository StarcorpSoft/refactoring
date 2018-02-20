/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.refactoringmaven;

/**
 *
 * @author Kio
 */
public class Recfactoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha = new Fecha(30, 9, 2020);
        fecha.siguienteDia();
        System.out.println("Fecha "+fecha.getFechaString());
    }
    
}
