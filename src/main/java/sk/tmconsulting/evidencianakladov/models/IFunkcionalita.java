package sk.tmconsulting.evidencianakladov.models;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IFunkcionalita {

    // Vstupne udaje z konzoly cez Scanner
    String zadajTextovyUdaj();
    double zadajCiselnyUdaj();

    // Agregacne funkcie
    double spocitajVsetkyVydavky() throws SQLException; // scitanie nechame na MySQL
    int zistiPocetVsetkychVydavkov();

    void vypisMenu();
    void exportPDF(); // exportuje vsetky zaznamy s detailami a celkovym sumarom

    // MySQL CRUD
    void ulozMySQL(Vydavok vydavok); // ulozi Vydavok do DB a nevrati nic
    ArrayList<Vydavok> vyberVsetkyMySQL(); // vyberie vsetky zaznamy z databazy a vrati ArrayList
    // Ako bude reagovat aplikacia, ked zvolime menu polozku Uprav zaznam. Aplikacia sa nasledne opyta na ID zaznamu, cize bude pracovat s nim
    void aktualizujMySQL(int id, Vydavok vydavok);
    void odstranMySQL(int id);
}
