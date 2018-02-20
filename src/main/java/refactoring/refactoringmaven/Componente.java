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
public abstract class Componente {

    protected int value;
    protected Componente padre;

    public Componente(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Componente getPadre() {
        return padre;
    }

    public void setPadre(Componente padre) {
        this.padre = padre;
    }

    public abstract int getLimite();

    public void siguiente() {
        this.value = this.value + 1;
        if (padre != null && this.sobrepaso()) {
            this.value = 1;
            this.getPadre().siguiente();
        }
    }

    public boolean sobrepaso() {
        return this.value > this.getPadre().getLimite();
    }

    @Override
    public String toString() {
        return this.value + "";
    }

}
