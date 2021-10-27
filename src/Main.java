public class Main {

    public static void main(String[] args) {
        Bil benzin = new Benzinbil("BZ49710", "Mazda", "M2", 2010, 5, 95, 19);
        benzin.beregnGrønEjerafgift();
        Bil el = new Elbil("EL425622", "Tesla", "Model X", 2015, 5,90, 250, 350);
        el.beregnGrønEjerafgift();
        Bil diesel = new Dieselbil("DS", "BMW", "320d", 2016, 5, false, 23);
        diesel.beregnGrønEjerafgift();

    }
}
