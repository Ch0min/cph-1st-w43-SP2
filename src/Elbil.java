public class Elbil extends Bil {
    private double batterikapacitetKWh;
    private int maxKm;
    private double whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, double batterikapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Parkeret bil: " + mærke + " " + model + ", " + årgang + " -Elbil";
    }

    @Override
    public double beregnGrønEjerafgift() {
        this.whPrKm = 100 / (whPrKm / 91.25);
        int price = 0;
        if (this.whPrKm >= 20 && this.whPrKm < 50) {
            price = 330;
            System.out.println("GrønEjerafgift El: " + price + "kr.");
        } else if (this.whPrKm >= 15 && this.whPrKm < 20) {
            price = 1050;
            System.out.println("GrønEjerafgift El: " + price + "kr.");
        } else if (this.whPrKm >= 10 && this.whPrKm < 15) {
            price = 2340;
            System.out.println("GrønEjerafgift El: " + price + "kr.");
        } else if (this.whPrKm >= 5 && this.whPrKm < 10) {
            price = 5500;
            System.out.println("GrønEjerafgift El: " + price + "kr.");
        } else if (this.whPrKm < 5) {
            price = 10470;
            System.out.println("GrønEjerafgift El: " + price + "kr.");
        }
        return this.whPrKm;
    }
}
