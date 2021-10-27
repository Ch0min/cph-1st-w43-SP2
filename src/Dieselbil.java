public class Dieselbil extends Bil {
    private boolean harPartikelfilter;
    private double kmPrL;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
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
        if (this.harPartikelfilter == true) {
            System.out.println("Partikeludledningsafgift: 0kr.");
        } else if (this.harPartikelfilter == false) {
            System.out.println("Partikeludledningsafgift: 1000kr.");
        }

        double dieselLiter = 0;
        this.kmPrL = dieselLiter;
        if (dieselLiter >= 20 && dieselLiter < 50) {
            System.out.println("GrønEjerafgift Diesel: 330kr. & Udligningsafgiften: 130kr.");
        } else if (dieselLiter >= 15 && dieselLiter < 20) {
            System.out.println("GrønEjerafgift Diesel: 1050kr. & Udligningsafgiften: 1390kr.");
        } else if (dieselLiter >= 10 && dieselLiter < 15) {
            System.out.println("GrønEjerafgift Diesel: 2340kr. & Udligningsafgiften: 1850kr.");
        } else if (dieselLiter >= 5 && dieselLiter < 10) {
            System.out.println("GrønEjerafgift Diesel: 5500kr. & Udligningsafgiften: 2770kr.");
        } else if (dieselLiter < 5) {
            System.out.println("GrønEjerafgift Diesel: 10470kr. & Udligningsafgiften: 15260kr.");
        }
        return dieselLiter;
    }
}

// For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også
//afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr, mellem 15 og 20 er
//den 1390 kr, mellem 10 og 15 er den 1850kr, mellem 5 og 10 er den 2770kr, og under 5 er den
//15260kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter
//monteret.










