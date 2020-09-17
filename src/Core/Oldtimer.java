package Core;

public class Oldtimer extends Auto implements IOldtimer
{
    private double sammlerWert;
    private int zustandsNote;

    public Oldtimer(String name, String erstzulassung, int leistung, double spritverbrauch, double eurotaxEinkaufspreis, double tatsaechlicherEinkaufspreis, double eurotaxVerkaufspreis) {
        super(name, erstzulassung, leistung, spritverbrauch, eurotaxEinkaufspreis, tatsaechlicherEinkaufspreis, eurotaxVerkaufspreis);
    }


    @Override
    public double getSammlerwert() {
        return 0;
    }

    @Override
    public int getZustandsnote() {
        return 0;
    }
}
