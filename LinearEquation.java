package linearequation;

public class LinearEquation {
    // Özel (private) veri alanları
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Yapıcı metot (Constructor)
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter Metotları
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Çözüm var mı kontrolü (ad - bc != 0)
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // X değerini hesaplayan metot
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Y değerini hesaplayan metot
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}