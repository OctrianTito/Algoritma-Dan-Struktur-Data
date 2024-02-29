import java.lang.Math;
public class Kerucut {
    public int jariJari;
    public int sisiMiring;
    public double tinggi;

    public Kerucut() {
    }

    public double hitungLuas() {
        return (Math.PI * jariJari * sisiMiring) + (Math.PI * jariJari * jariJari);
    }

    public double hitungVolume() {
        tinggi = Math.sqrt(sisiMiring * sisiMiring - jariJari * jariJari);
        return (Math.PI * jariJari * jariJari * tinggi) / 3;
    }
}