public class Benzinbil extends Bil {
    private int oktantal;
    private double kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Parkeret bil: " + mærke + " " + model + ", " + årgang + " -Benzinbil";

    }

    @Override
    public double beregnGrønEjerafgift() {
        int price = 0;
        if (this.kmPrL >= 20 && this.kmPrL < 50) {
            price = 330;
            System.out.println("GrønEjerafgift Benzin: " + price + "kr.");
        } else if (this.kmPrL >= 15 && this.kmPrL < 20) {
            price = 1050;
            System.out.println("GrønEjerafgift Benzin: " + price + "kr.");
        } else if (this.kmPrL >= 10 && this.kmPrL < 15) {
            price = 2340;
            System.out.println("GrønEjerafgift Benzin: " + price + "kr.");
        } else if (this.kmPrL >= 5 && this.kmPrL < 10) {
            price = 5500;
            System.out.println("GrønEjerafgift Benzin: " + price + "kr.");
        } else if (this.kmPrL < 5) {
            price = 10470;
            System.out.println("GrønEjerafgift Benzin: " + price + "kr.");
        }
        return this.kmPrL;
    }
}









