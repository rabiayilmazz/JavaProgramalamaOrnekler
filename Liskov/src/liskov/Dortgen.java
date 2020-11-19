package liskov;

public class Dortgen implements Sekil{
    private double kenar1, kenar2;
    
    public Dortgen(double kenar1, double kenar2){
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }
    public Dortgen(){}

    /**
     * @return the kenar1
     */
    public double getKenar1() {
        return kenar1;
    }

    /**
     * @param kenar1 the kenar1 to set
     */
    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    /**
     * @return the kenar2
     */
    public double getKenar2() {
        return kenar2;
    }

    /**
     * @param kenar2 the kenar2 to set
     */
    public void setKenar2(double kenar2) {
        this.kenar2 = kenar2;
    }
    
    @Override
    public double cevreHesapla() {
       return (getKenar1() + getKenar2())*2;
    }

    @Override
    public double alanHesabla() {
        return getKenar1() * getKenar2();
    }
    
}
