public class Main {

    public static void main(String[] args) {
        Bil benzin = new Benzinbil("BZ49710", "Mazda", "M2", 2010, 5, 95, 19);
        Bil el = new Elbil("EL425622", "Tesla", "Model X", 2015, 5, 90, 250, 350);
        Bil diesel = new Dieselbil("DS983211", "BMW", "320d", 2016, 5, true, 7);

        Garage myGarage = new Garage();
        System.out.println(myGarage);
        myGarage.addCar(benzin);
        myGarage.addCar(el);
        myGarage.addCar(diesel);

        for (Bil biler : myGarage.garageArray) {
            System.out.println(biler);

        }
        myGarage.beregnGrønAfgiftForBilpark();
    }
}

/* Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper
af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og
skriv resultatet ud.
 */