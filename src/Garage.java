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
        double sum = 0;
        for (Bil b : garageArray) {
            sum = (int) (sum + b.beregnGrønEjerafgift());

        }
        System.out.println(" - TOTAL AFGIFT PÅ BILER: - " + sum + "kr.");
    }
}

// double sum = 0;
//for(Double d : m)
//    sum += d;
//return sum;


// Den skal også have en metode der hedder
//beregnGrønAfgiftForBilpark() der beregner den samlede grønne afgift for alle bilerne i garagen.
//Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper
//af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og
//skriv resultatet ud.
//Aflevering: Projektet lægges på github og uploades på Moodle via link til repository.
//Afleveringen er individuel, men I må gerne arbejde i grupper