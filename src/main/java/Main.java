import com.itextpdf.text.DocumentException;
import sk.tmconsulting.evidencianakladov.models.Funkcionalita;
import sk.tmconsulting.evidencianakladov.models.Vydavok;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws SQLException, DocumentException, IOException {
        Funkcionalita funkcionalita = new Funkcionalita();
        //funkcionalita.zadajTextovyUdaj(); // OK
        //double sucet = funkcionalita.spocitajVsetkyVydavky();
        //System.out.println("Celková hodnota výdavkov je: " + sucet);
        //int pocet = funkcionalita.zistiPocetVsetkychVydavkov();
        //System.out.println("Počet výdavkov je: " + pocet);
        //funkcionalita.vypisMenu(); // OK
        funkcionalita.exportMySQL2PDF();

        // START Ulozenie vydavku
/*        Vydavok vydavokObjekt = new Vydavok();
        vydavokObjekt.setPopis("Sukňa");
        vydavokObjekt.setCena(20.90);
        vydavokObjekt.setKategoria("Oblečenie");
        Calendar currenttime = Calendar.getInstance();
        Date dnesnyDatum = new Date((currenttime.getTime()).getTime()); // aktualny dnesny Datum
        vydavokObjekt.setDatum(dnesnyDatum);
        vydavokObjekt.setDatum(new Date(2023,2,26)); // vytvorenie vlastneho datumu, to je vsak zastaraly sposob (deprecated), neodporuca sa!
        funkcionalita.ulozMySQL(vydavokObjekt);*/
        // END Ulozenie vydavku

        Vydavok vydavokObjekt = new Vydavok();
        vydavokObjekt.setPopis("Kofola");
        vydavokObjekt.setCena(1.49);
        vydavokObjekt.setKategoria("Potraviny - nápoje");
        vydavokObjekt.setDatum(Date.valueOf(LocalDate.of( 2023 , 2 , 28 )));
        funkcionalita.aktualizujMySQL(2, vydavokObjekt);
        //funkcionalita.odstranMySQL(1);

    }
}
