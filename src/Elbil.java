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
        if (this.whPrKm >= 20 && whPrKm < 50) {
            price = 330;
        } else if (whPrKm >= 15 && whPrKm < 20) {
            price = 1050;
        } else if (whPrKm >= 10 && whPrKm < 15) {
            price = 2340;
        } else if (whPrKm >= 5 && whPrKm < 10) {
            price = 5500;
        } else if (whPrKm < 5) {
            price = 10470;
        }
        return price;
    }
}

/* 2. For en Elbil gælder de samme regler som for benzinbilen, blot skal man først omregne whPrKm til
kmPrL. Det udregnes således: 100 / (whPrKm / 91,25). Se evt. formlen her: https://fdm.dk/alt-ombiler/dine-rettigheder/boderafgifter/ejerafgift-elbil.
 */
