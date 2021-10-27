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
        return null;
    }

    @Override
    public double beregnGrønEjerafgift() {
        this.whPrKm = 100 / (whPrKm / 91.25);

        if (this.whPrKm >= 20 && this.whPrKm < 50) {
            System.out.println("GrønEjerafgift El: 330kr.");
        } else if (this.whPrKm >= 15 && this.whPrKm < 20) {
            System.out.println("GrønEjerafgift El: 1050kr.");
        } else if (this.whPrKm >= 10 && this.whPrKm < 15) {
            System.out.println("GrønEjerafgift El: 2340kr.");
        } else if (this.whPrKm >= 5 && this.whPrKm < 10) {
            System.out.println("GrønEjerafgift El: 5500kr.");
        } else if (this.whPrKm < 5) {
            System.out.println("GrønEjerafgift El: 10470kr");
        }
        return this.whPrKm;
    }
}
