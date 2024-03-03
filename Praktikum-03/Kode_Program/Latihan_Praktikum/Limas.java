import java.lang.Math;
public class Limas {
    public int panjangSisiAlas;
    public double tinggi;
    public double sisiMiring;

    public double hitungVolumeLimas() {
        return (panjangSisiAlas * panjangSisiAlas * tinggi) / 3;
    }

    public double hitungLuasLimas() {
        sisiMiring = Math.sqrt((panjangSisiAlas * 0.5) * (panjangSisiAlas * 0.5) + (tinggi * tinggi));
        return (0.5 * 4 * panjangSisiAlas * sisiMiring) + (panjangSisiAlas * panjangSisiAlas);
    }

    public Limas() {

    }
}
