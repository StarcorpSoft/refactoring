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
public class Dia extends Componente{

    public Dia(int value) {
        super(value);
    }

    @Override
    public int getLimite() {
        return this.getPadre().getLimite();
    }
    
    
}
