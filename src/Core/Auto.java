package Core;

public class Auto extends Fahrzeuge implements IFortbewegungsmittel
{
    private int anzahlDerSitze;
    private boolean isBenziner;

    public Auto(String name, String erstzulassung, int leistung, double spritverbrauch, double eurotaxEinkaufspreis, double tatsaechlicherEinkaufspreis, double eurotaxVerkaufspreis) {
        super(name, erstzulassung, leistung, spritverbrauch, eurotaxEinkaufspreis, tatsaechlicherEinkaufspreis, eurotaxVerkaufspreis);
    }

    @Override
    public int GetPassagierkapazitaet() {
        return 0;
    }

    @Override
    public double GetKilomenterpreisFuerBenzin() {
        return 0;
    }

    @Override
    public int compareTo(Fahrzeuge o) {
        return 0;
    }
}
