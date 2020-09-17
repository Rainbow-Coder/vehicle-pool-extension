# vehicle-pool-extension

Ein Händler für gebrauchte Fahrzeuge (Autos, Motorräder, Oldtimer) hat folgende Anforderungen,
welche zu erfüllen sind:

1. Autos verfügen über die Attribute: Name, Erstzulassung (Jahr), Leistung (in kW), Spritverbrauch,
Anzahl der Sitze, EurotaxJEinkaufspreis, tatsächlicher Einkaufspreis und EurotaxJVerkaufspreis

2. Motorräder hingegen haben die Attribute: Name, Erstzulassung (Jahr), Leistung (in kW),
Spritverbrauch, EurotaxJEinkaufspreis, tatsächlicher Einkaufspreis, EurotaxJ Verkaufspreis und
Motortyp (2takt, 4takt)

3. Sowohl Autos, als auch Motorräder sind Fortbewegungsmittel (Interface!), die über eine
Methode zur Berechnung der Passagierkapazität verfügen. Fortbewegungsmittel sind in der Lage ihren
Kilometerpreis (nur Benzin) berechnen zu können.

4. Oldtimer hingegen sind spezielle Autos, welche Sammlerstücke (Interface) sind. Sie besitzen
eine Methode, die den Sammlerwert errechnet, zu dem sie verkauft werden können. Oldtimer haben
eine Zustandsnote (1J5), wobei Note 1 ein makelloser und 5 ein restaurationsbedürftiger Zustand ist.

5. Der Händler hat ein bunt gemischtes Angebot. Definieren Sie für das Testprogramm einen
entsprechenden Fuhrpark. Der Fuhrpark wird in einem passenden Array verwaltet.

6. Die meisten Interessenten haben beim Besuch des Händlers eine gewisse Preisvorstellung. Daher
möchte der Händler eine Liste seiner Fahrzeuge, die nach dem Preis sortiert wird. Implementieren Sie
eine Möglichkeit, eine Liste der Fahrzeuge mit den wichtigsten Daten auszugeben, welche nach dem
Verkaufspreis sortiert ist. Hinweis: Arrays.sort()

## Aufgabe 1) 
Modellieren Sie den Sachverhalt in einem UML Diagramm und speichern Sie diese im pdf-Format.

## Aufgabe 2) 
Implementieren Sie den Sachverhalt

## Aufgabe 3)
Es soll möglich sein, nach weiteren Attributen zu sortieren
* Erstzulassung
* Leistung
* Namen
* Spritverbrauch
Wie kann das einfach realisiert werden?

