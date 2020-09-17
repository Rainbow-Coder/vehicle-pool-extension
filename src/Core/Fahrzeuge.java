package Core;

public class Fahrzeuge
{
    private String name;
    private String erstzulassung;
    private int leistung;
    private double spritverbrauch;
    private double eurotaxEinkaufspreis;
    private double tatsaechlicherEinkaufspreis;
    private double eurotaxVerkaufspreis;

    public Fahrzeuge(String name, String erstzulassung, int leistung, double spritverbrauch, double eurotaxEinkaufspreis, double tatsaechlicherEinkaufspreis, double eurotaxVerkaufspreis)
    {
        this.name = name;
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        this.spritverbrauch = spritverbrauch;
        this.eurotaxEinkaufspreis = eurotaxEinkaufspreis;
        this.tatsaechlicherEinkaufspreis = tatsaechlicherEinkaufspreis;
        this.eurotaxVerkaufspreis = eurotaxVerkaufspreis;
    }
}
