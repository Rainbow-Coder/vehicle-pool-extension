package Core;

public interface IFortbewegungsmittel extends Comparable<Fahrzeuge>
{
    int GetPassagierkapazitaet();
    double GetKilomenterpreisFuerBenzin();
}
