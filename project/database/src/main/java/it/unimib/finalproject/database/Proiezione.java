package it.unimib.finalproject.database;

import java.util.Hashtable;

public class Proiezione {
    private int id;
    private String[][] postiDisponibili;
    private String data;
    private String ora;
    
    public Proiezione(){
        char a= 'A';
        postiDisponibili= new String[8][10];
        for(int i =0;i<8;i++){
            a+=i;
            for(int j=0;j<10;j++){
                postiDisponibili[i][j]=(char)a+""+j;
            }
        }
    }

    public void setId(){}

    public void setData(){}

    public void setOra(){}
}
