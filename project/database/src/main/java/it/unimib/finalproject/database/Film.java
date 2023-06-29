package it.unimib.finalproject.database;

import java.io.Serializable;

public class Film implements Serializable{
    private String descrizione;
    private String titolo;

    public Film(String titolo, String descrizione){
        this.titolo=titolo;
        this.descrizione=descrizione;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }


    public String getTitolo(){
        return titolo;
    }

    public String getDescrizione(){
        return descrizione;
    }
}
