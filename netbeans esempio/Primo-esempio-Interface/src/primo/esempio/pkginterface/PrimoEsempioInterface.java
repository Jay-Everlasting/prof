/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primo.esempio.pkginterface;

public class PrimoEsempioInterface {

    public static void main(String[] args) throws Exception {

        Contatto c;
        Rubrica r;
        r = new Rubrica();

        try {
            c = new Contatto("Mario", "Rossi", "0255600511", "mario.rossi@uuu.it");
            r.aggiungi(c);
        } catch (NullPointerException ex) {
            System.out.println("Errore " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Errore " + ex);
        }
        
        try {
            c = new Contatto("Filippo", "Primo", "3469875246", "spagna.solomia@ii.sp");
            r.aggiungi(c);
        } catch (NullPointerException ex) {
            System.out.println("Errore " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Errore " + ex);
        }
        
        try {
            c = new Contatto("Anastasia", "BellaDonna", "0000222544", "rossetto.rosso@xxx.rs");
            r.aggiungi(c);
        } catch (NullPointerException ex) {
            System.out.println("Errore " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Errore " + ex);
        }
        
        try {
            c = new Contatto("Sebastian", "Reckah", "5551234895", "greyhat.hacker@hotmail.hk");
            r.aggiungi(c);
        } catch (NullPointerException ex) {
            System.out.println("Errore " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Errore " + ex);
        }

        c = r.cerca("Primo");
        if (c != null) {
            System.out.println("Trovato " + c.toString());
        } else {
            System.out.println("Non ho trovato un contatto con cognome " + "gggg");
        }

        c = r.cerca("Bicnchi");
        if (c != null) {
            System.out.println("Trovato " + c.toString());
        } else {
            System.out.println("Non ho trovato un contatto con cognome " + "Bianchi");
        }
        
        System.out.println("\nTutta la rubrica : \n" + r.toString());

    }
}
