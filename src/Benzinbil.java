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
        return null;

    }

    @Override
    public double beregnGrønEjerafgift() {
        if (this.kmPrL >= 20 && this.kmPrL < 50) {
            System.out.println("GrønEjerafgift Benzin: 330kr.");
        } else if (this.kmPrL >= 15 && this.kmPrL < 20) {
            System.out.println("GrønEjerafgift Benzin: 1050kr.");
        } else if (this.kmPrL >= 10 && this.kmPrL < 15) {
            System.out.println("GrønEjerafgift Benzin: 2340kr.");
        } else if (this.kmPrL >= 5 && this.kmPrL < 10) {
            System.out.println("GrønEjerafgift Benzin: 5500kr.");
        } else if (this.kmPrL < 5) {
            System.out.println("GrønEjerafgift Benzin: 10470kr");
        }
        return this.kmPrL;
    }
}









