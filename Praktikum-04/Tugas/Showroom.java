public class Showroom {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    Showroom(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public static int maxAcceleration(Showroom[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMax = maxAcceleration(cars, l, mid);
            int rightMax = maxAcceleration(cars, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
        return Integer.MIN_VALUE;
    }

    public static int minAcceleration(Showroom[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMin = minAcceleration(cars, l, mid);
            int rightMin = minAcceleration(cars, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
        return Integer.MAX_VALUE;
    }

    public static double averagePower(Showroom[] cars) {
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            sum += cars[i].top_power;
        }
        return (double) sum / cars.length;
    }
    public static void main(String[] args) {
        Showroom[] cars = {
            new Showroom("BMW", "M2 Coupe", 2016, 6816, 728),
            new Showroom("Ford", "Fiesta ST", 2014, 3921, 575),
            new Showroom("Nissan", "370Z", 2009, 4360, 657),
            new Showroom("Subaru", "BRZ", 2014, 4058, 609),
            new Showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Showroom("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Showroom("Toyota", "86/GT86", 2014, 4180, 609),
            new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        
        int maxAcceleration = Showroom.maxAcceleration(cars, 0, cars.length - 1);
        int minAcceleration = Showroom.minAcceleration(cars, 0, cars.length - 1);
        double averagePower = Showroom.averagePower(cars);
        
        System.out.println("Mobil dengan akselerasi tertinggi : " + maxAcceleration);
        System.out.println("Mobil dengan akselerasi terndah :" + minAcceleration);
        System.out.println("Rata2 power semua mobil : " + averagePower);
    }
}