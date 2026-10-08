package location;

public class Location {

    // 1. Veri alanları (Sınıf düzeyinde ve public olmalı)
    public int row;
    public int column;
    public double maxValue;

    // 2. Yapıcı Metot (Constructor)
    public Location() {
        this.row = 0;
        this.column = 0;
        this.maxValue = 0.0;
    }

    // 3. static Metot (Matrisi tarayıp sonucu döndüren tek metot)
    public static Location locateLargest(double[][] a) {
        Location s1 = new Location();

        s1.column = 0;
        s1.row = 0;
        s1.maxValue = a[0][0];

        // Matrisi tarayan çift for döngüsü
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > s1.maxValue) {
                    s1.maxValue = a[i][j];
                    s1.row = i;
                    s1.column = j;
                }
            }
        }

        return s1;
    }
}