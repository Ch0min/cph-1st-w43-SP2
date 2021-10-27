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
        if (kmPrL >= 20 && kmPrL < 50) {
            price = 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            price = 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            price = 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            price = 5500;
        } else if (kmPrL < 5) {
            price = 10470;
        }
        return price;
    }
}









