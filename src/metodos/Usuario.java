/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author T-107
 */
public class Usuario {
    private int Edad;

public int getEdad() {
        if(Edad<0){
            Edad=0;
            System.out.println(" No debes meter edades menores a cero ");
        }
        return Edad;
    }

 

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.Edad = edad;
   

}
}

