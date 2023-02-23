import sk.tmconsulting.evidencianakladov.models.Funkcionalita;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Funkcionalita funkcionalita = new Funkcionalita();
        //funkcionalita.zadajTextovyUdaj(); // OK
        double sucet = funkcionalita.spocitajVsetkyVydavky();
        System.out.println("Celková hodnota výdavkov je: " + sucet);
    }
}
