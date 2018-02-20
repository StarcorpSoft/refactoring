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
public class Anno extends Componente {

    public Anno(int value) {
        super(value);
    }

    @Override
    public int getLimite() {
        return 12;
    }

}
