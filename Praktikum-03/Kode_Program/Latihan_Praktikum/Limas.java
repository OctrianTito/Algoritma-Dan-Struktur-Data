public class Limas {
    public int panjangSisiAlas;
    public int tinggi;

    public double hitungVolumeLimas() {
        return (panjangSisiAlas * panjangSisiAlas * tinggi) / 3;
    }

    public double hitungLuasLimas() {
        return (0.5 * 4 * panjangSisiAlas * tinggi) + (panjangSisiAlas * panjangSisiAlas);
    }

    public Limas() {

    }
}
