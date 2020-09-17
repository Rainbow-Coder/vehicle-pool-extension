package Core;

public interface IOldtimer
{
    /**
     * Sammlerwert fuer einen Verkauf.
     *
     * @return Geld
     */
    double getSammlerwert();

    /**
     * Note 1 - 5, wobei 1 makelloser Zustand und 5 restaurationsbeduerftiger Zustand bedeutet.
     * @return Bewertung
     */
    int getZustandsnote();
}
