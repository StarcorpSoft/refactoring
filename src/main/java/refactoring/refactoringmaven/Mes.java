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
public class Mes extends Componente {

    private final int[] limites = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Mes(int value) {
        super(value);
    }

    @Override
    public int getLimite() {
        int valor = this.getPadre().getValue();
        int limite = this.limites[this.value];
        if (this.value == 2) {
            if (esMultiplo(4, valor) && !esMultiplo(100, valor) || esMultiplo(400, valor)) {
                return limite + 1;
            }
        }
        return limite;
    }

    private boolean esMultiplo(int multiplo, int valor) {
        return (valor % multiplo) == 0;
    }

}
