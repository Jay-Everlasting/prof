/*
Classe Contatto - Contiene informazioni sui contatti (nome, cognome, telefono, email)
 */
package primo.esempio.pkginterface;

import java.util.Objects;

public class Contatto {
    private String nome;
    private String cognome;
    private String telefono;
    private String email;

    public Contatto(String nome, String cognome, String telefono, String email) throws Exception {
        valida(nome,cognome,telefono,email);
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.email = email;
    }
    //facciamo: to string, get, equals

    @Override
    public String toString() {
        return "Contatto: " + this.nome + " " + this.cognome + " | Telefono: " + this.telefono + " | Email: " + this.email + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.cognome);
        hash = 11 * hash + Objects.hashCode(this.telefono);
        hash = 11 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contatto other = (Contatto) obj;
        return true;
    }
    
    //non facciamo il costruttore di copia
    private void valida(String nome, String cognome, String telefono, String email) throws Exception{
        if(nome==null)
            throw new NullPointerException("nome null");
        if(cognome==null)
            throw new NullPointerException("cognome null");
        if(telefono==null)
            throw new NullPointerException("telefono null");
        if(email==null)
            throw new NullPointerException("email null");
        //manca controllo che ci sia almeno una @ nell'email
        //manca controllo che numero di digit di numero di telefono sia <= 11 e >= non lo so


    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    /*
    public void setTelefono(String nuovoTelefono) throws Exception {
        this.valida(this.nome, this.cognome, nuovoTelefono, this.email);
        this.telefono=nuovoTelefono;        
       //this.valida(this.getNome(), this.getCognome(), nuovoTelefono, this.getEmail());
    }
    
    public void setEmail(String e) {
        
    }
    */
}
