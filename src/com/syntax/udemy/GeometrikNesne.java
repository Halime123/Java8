package com.syntax.udemy;

import java.util.Date;

public class GeometrikNesne {

    private String renk;
    private boolean dolu;
    private Date olusturmaTarihi;

    public GeometrikNesne (){
        renk="Beyaz";
        olusturmaTarihi=new Date();
    }
    public GeometrikNesne(String renk, boolean dolu){
        this();
        this.renk=renk;
        this.dolu=dolu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isDolu() {
        return dolu;
    }

    public void setDolu(boolean dolu) {
        this.dolu = dolu;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
    public String toString(){
        return "created on"+olusturmaTarihi+"n/color"+renk+"dolumu= "+dolu;
    }
}
