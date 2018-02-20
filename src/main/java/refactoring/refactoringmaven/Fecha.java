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
public class Fecha {
    
    private Dia dia;
    private Mes mes;
    private Anno anno;

    public Fecha(int d,int m,int a) {
        this.dia = new Dia(d);
        this.mes = new Mes(m);
        this.anno = new Anno(a);
        
        this.dia.setPadre(mes);
        this.mes.setPadre(anno);
        this.anno.setPadre(null);
    }
    
    public void siguienteDia(){
        this.dia.siguiente();
    }
    
    public String getFechaString(){
        return this.dia +"-"+this.mes+"-"+this.anno;
    }
    
    
    
}
