package sk.tmconsulting.evidencianakladov.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Funkcionalita implements IFunkcionalita {
    private Connection conn;

    public Funkcionalita() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/evidencianakladov_db"; // zmeňte URL a názov databázy podľa potreby
        String username = "root"; // zmeňte používateľské meno podľa potreby
        String password = "password"; // zmeňte heslo podľa potreby
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Spojenie s databázou je v poriadku!");
    }

    @Override
    public String zadajTextovyUdaj() {
        Scanner scn = new Scanner(System.in); // inicializacia konzoly
        //String vstupnyText = scn.nextLine(); // vstup z konzoly
        //return vstupnyText;
        return scn.nextLine();
    }

    @Override
    public double zadajCiselnyUdaj() {
        Scanner scn = new Scanner(System.in); // inicializacia konzoly
        return scn.nextDouble();
    }

    @Override
    public double spocitajVsetkyVydavky() throws SQLException {
        String query = "SELECT SUM(cena) AS sucet FROM vydavky";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            double sucet = rs.getDouble("sucet");
            return sucet;
        }
        return 0;
    }

    @Override
    public int zistiPocetVsetkychVydavkov() {
        return 0;
    }

    @Override
    public void vypisMenu() {

    }

    @Override
    public void exportPDF() {

    }

    @Override
    public void ulozMySQL(Vydavok vydavok) {

    }

    @Override
    public ArrayList<Vydavok> vyberVsetkyMySQL() {
        return null;
    }

    @Override
    public void aktualizujMySQL(int id, Vydavok vydavok) {

    }

    @Override
    public void odstranMySQL(int id) {

    }
}
