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
        return "Parkeret bil: " + mærke + " " + model + ", " + årgang + " -Dieselbil";
    }

    @Override
    public double beregnGrønEjerafgift() {
        int sum;
        if (harPartikelfilter == true) {
            sum = 0;
            System.out.println("Partikeludledningsafgift Diesel: " + sum + "kr.");
        } else if (harPartikelfilter == false) {
            sum = 1000;
            System.out.println("Partikeludledningsafgift Diesel: " + sum + "kr.");
        }

        int price = 0;
        if (kmPrL >= 20 && kmPrL < 50) {
            price = 330 + 130;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            price = 1050 + 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            price = 2340 + 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            price = 5500 + 2770;
        } else if (kmPrL < 5) {
            price = 10470 + 15260;
        }
        return price;
    }
}

// For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også
//afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr, mellem 15 og 20 er
//den 1390 kr, mellem 10 og 15 er den 1850kr, mellem 5 og 10 er den 2770kr, og under 5 er den
//15260kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter
//monteret.








