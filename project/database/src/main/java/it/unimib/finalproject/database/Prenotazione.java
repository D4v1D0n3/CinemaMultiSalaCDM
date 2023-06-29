package it.unimib.finalproject.database;

import java.io.Serializable;
import java.util.List;

public class Prenotazione implements Serializable{
    private int id;
    private Proiezione proiezione;

    public Prenotazione(Proiezione proiezione){
        this.proiezione=proiezione;
    }
    
    public void setid(int id){
        this.id=id;
    }

    public int getid(){
        return this.id;
    }

    public Proiezione getProiezione(){
        return this.proiezione;
    }

    public void modificaPrenotazione(){

    }

    public void eliminaPrenotazione(){

    }

}
