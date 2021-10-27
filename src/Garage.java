import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> garageArray;

    public Garage() {
        garageArray = new ArrayList<>();

    }

    public void addCar(Bil bil) {
    this.garageArray.add(bil);
    }

    @Override
    public String toString() {
        return " *DU HAR NU FØLGENDE BILER I DIN GARAGE* ";
    }

    public void beregnGrønAfgiftForBilpark() {


    }

}



// Der skal være en klasse der hedder Garage, som har en ArrayList der kan indeholde biler. Garageklassen
//skal have et navn, samt en metode til at tilføje biler til bilparken. Den skal override toString, sådan at den
//skriver alle de biler ud der holder i garagen. Den skal også have en metode der hedder
//beregnGrønAfgiftForBilpark() der beregner den samlede grønne afgift for alle bilerne i garagen.
//Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper
//af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og
//skriv resultatet ud.
//Aflevering: Projektet lægges på github og uploades på Moodle via link til repository.
//Afleveringen er individuel, men I må gerne arbejde i grupper