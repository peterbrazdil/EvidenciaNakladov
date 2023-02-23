package sk.tmconsulting.evidencianakladov.models;
import java.sql.Date;
//TODO Prestavka do 20.35
public class Vydavok {
    private String popis;
    private double cena;
    private String kategoria;
    private Date datum;

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
