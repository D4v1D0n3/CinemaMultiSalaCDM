package it.unimib.finalproject.database;

import java.io.Serializable;
import java.util.Hashtable;

public class Proiezione implements Serializable{
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

    public void setId(int id){this.id=id;}

    public void setData(String data){this.data=data;}

    public void setOra(String ora){this.ora=ora;}

    public int getId(){return this.id;}

    public String getData(){return this.data;}

    public String getOra(){return this.ora;}

    public String prenota(String[] posti){
        String a="";
        for(int i=0;i<posti.length;i++){
            a = postiDisponibili[(int)posti[i].charAt(0)-"A"][(int)posti[i].charAt(1)];
            if(a!=null)
            a=null;
            else
            return "posto "+posti[i]+" non disponibile";
        }

        return "ok";
    }
}
