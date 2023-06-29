package it.unimib.finalproject.database;

import java.io.Serializable;

public class Film implements Serializable{
    private String descrizione;
    private String titolo;

    public Film(String titolo, String descrizione){
        this.titolo=titolo;
        this.descrizione=descrizione;
    }
}
