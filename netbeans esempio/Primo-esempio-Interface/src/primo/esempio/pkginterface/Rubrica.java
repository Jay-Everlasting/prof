/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primo.esempio.pkginterface;

import java.util.ArrayList;

public class Rubrica implements AstrazioneDiRubrica{
    private ArrayList<Contatto> contatti;
    //fare costruttore, toString, get
    Rubrica(){
        this.contatti=new ArrayList();
    }
    public void aggiungi(Contatto c){
        contatti.add(c);
    }
    public Contatto cerca(String s){
        Contatto c;
        int i;
        c=null;
        for(i=0;i<contatti.size();i++){
            c=contatti.get(i);
            if(c.getCognome().equals(s)){
                return c;
            }
        }   
        return null;
    }

    @Override
    public String toString() {
        return "" + contatti;
    }
}
