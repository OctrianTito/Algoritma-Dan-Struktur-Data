public class Bola {
    public int jariBola;

    public Bola() {

    }

    public double hitungLuasBola() {
        return 4 * Math.PI * jariBola * jariBola;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * jariBola * jariBola * jariBola;
    }

}
