import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL klasemen = new DLL();
        Race hasilRace = new Race(klasemen);
        int pilihan;

        // Menambahkan data pembalap ke dalam kelasemen
        klasemen.addIndexOf(1, "Lewis Hamilton", "Mercedes", 0, 0, 0);
        klasemen.addIndexOf(2, "Max Verstappen", "Red Bull Racing", 0, 0, 0);
        klasemen.addIndexOf(3, "Valtteri Bottas", "Mercedes", 0, 0, 0);
        klasemen.addIndexOf(4, "Charles Leclerc", "Ferrari", 0, 0, 0);
        klasemen.addIndexOf(5, "Daniel Ricciardo", "McLaren", 0, 0, 0);
        klasemen.addIndexOf(6, "Lando Norris", "McLaren", 0, 0, 0);
        klasemen.addIndexOf(7, "Carlos Sainz Jr.", "Ferrari", 0, 0, 0);
        klasemen.addIndexOf(8, "Pierre Gasly", "AlphaTauri", 0, 0, 0);
        klasemen.addIndexOf(9, "Fernando Alonso", "Alpine", 0, 0, 0);
        klasemen.addIndexOf(10, "Esteban Ocon", "Alpine", 0, 0, 0);
        klasemen.addIndexOf(11, "Sebastian Vettel", "Aston Martin", 0, 0, 0);
        klasemen.addIndexOf(12, "Lance Stroll", "Aston Martin", 0, 0, 0);
        klasemen.addIndexOf(13, "Kimi Räikkönen", "Alfa Romeo", 0, 0, 0);
        klasemen.addIndexOf(14, "Antonio Giovinazzi", "Alfa Romeo", 0, 0, 0);
        klasemen.addIndexOf(15, "Mick Schumacher", "Haas", 0, 0, 0);
        klasemen.addIndexOf(16, "Nikita Mazepin", "Haas", 0, 0, 0);
        klasemen.addIndexOf(17, "Yuki Tsunoda", "AlphaTauri", 0, 0, 0);
        klasemen.addIndexOf(18, "Nicholas Latifi", "Williams", 0, 0, 0);
        klasemen.addIndexOf(19, "George Russell", "Williams", 0, 0, 0);
        klasemen.addIndexOf(20, "Sergio Pérez", "Red Bull Racing", 0, 0, 0);
    
        do {
            int inner;
            System.out.println("DATA KLASEMEN FORMULA ONE TAHUN 2021");
            System.out.println("Menu:");
            System.out.println("1. Lihat hasil setiap balapan");
            System.out.println("2. Lihat Klasemen Akhir");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                do {
                    System.out.println("Dimohon untuk memilih sirkuit secara berurutan. Terima Kasih");
                    System.out.println("Daftar Sirkuit :");
                    System.out.println("1. GP Bahrain");
                    System.out.println("2. GP Emilia Romagna");
                    System.out.println("3. GP Portugal");
                    System.out.println("4. GP Spanyol");
                    System.out.println("5. GP Monako");
                    System.out.println("6. GP Azerbaijan");
                    System.out.println("7. GP Perancis");
                    System.out.println("8. GP Steiermark");
                    System.out.println("9. GP Austria");
                    System.out.println("10. GP Britania");
                    System.out.println("11. GP Hungaria");
                    System.out.println("12. GP Belgia");
                    System.out.println("13. GP Belanda");
                    System.out.println("14. GP Italia");
                    System.out.println("15. GP Russia");
                    System.out.println("16. GP Turki");
                    System.out.println("17. GP US");
                    System.out.println("18. GP Meksiko");
                    System.out.println("19. GP Brasil");
                    System.out.println("20. GP Qatar");
                    System.out.println("21. GP Saudi");
                    System.out.println("22. GP Abu Dhabi");
                    System.out.println("0. Keluar");
        
                    System.out.print("Masukkan pilihan: ");
                    inner = sc.nextInt();
        
                    switch (inner) {
                        case 1:
                            gpBahrain(klasemen, hasilRace);
                            break;
                        case 2:
                            hasilRace.clearRaceResults();
                            gpEmiliaRomagna(klasemen, hasilRace);
                            break;
                        case 3:
                            hasilRace.clearRaceResults();
                            gpPortugal(klasemen, hasilRace);
                            break;
                        case 4:
                            hasilRace.clearRaceResults();
                            gpSpanyol(klasemen, hasilRace);
                            break;
                        case 5:
                            hasilRace.clearRaceResults();
                            gpMonako(klasemen, hasilRace);
                            break;
                        case 6:
                            hasilRace.clearRaceResults();
                            gpAzerbaijan(klasemen, hasilRace);
                            break;
                        case 7:
                            hasilRace.clearRaceResults();
                            gpPerancis(klasemen, hasilRace);
                            break;
                        case 8:
                            hasilRace.clearRaceResults();
                            gpSteiermark(klasemen, hasilRace);
                            break;
                        case 9:
                            hasilRace.clearRaceResults();
                            gpAustria(klasemen, hasilRace);
                            break;
                        case 10:
                            hasilRace.clearRaceResults();
                            gpBritania(klasemen, hasilRace);
                            break;
                        case 11:
                            hasilRace.clearRaceResults();
                            gpHungaria(klasemen, hasilRace);
                            break;
                        case 12:
                            hasilRace.clearRaceResults();
                            gpBelgia(klasemen, hasilRace);
                            break;
                        case 13:
                            hasilRace.clearRaceResults();
                            gpBelanda(klasemen, hasilRace);
                            break;
                        case 14:
                            hasilRace.clearRaceResults();
                            gpItalia(klasemen, hasilRace);
                            break;
                        case 15:
                            hasilRace.clearRaceResults();
                            gpRussia(klasemen, hasilRace);
                            break;
                        case 16:
                            hasilRace.clearRaceResults();
                            gpTurki(klasemen, hasilRace);
                            break;
                        case 17:
                            hasilRace.clearRaceResults();
                            gpUS(klasemen, hasilRace);
                            break;
                        case 18:
                            hasilRace.clearRaceResults();
                            gpMeksiko(klasemen, hasilRace);
                            break;
                        case 19:
                            hasilRace.clearRaceResults();
                            gpBrasil(klasemen, hasilRace);
                            break;
                        case 20:
                            hasilRace.clearRaceResults();
                            gpQatar(klasemen, hasilRace);
                            break;
                        case 21:
                            hasilRace.clearRaceResults();
                            gpSaudi(klasemen, hasilRace);
                            break;
                        case 22:
                            hasilRace.clearRaceResults();
                            gpAbuDhabi(klasemen, hasilRace);
                            break;
                        case 0:
                            System.out.println("Program berakhir.");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        }
                    } while (inner != 0);
                break;
                case 2:
                    klasemen.printKlasemen();
                break;
            }
        } while (pilihan != 0);
}


    static void gpBahrain(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:32:03.897", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull Racing", "+0.745s", 18, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+37.383s", 16, 0);
        hasilRace.addResult(4, "Britania Raya", "Lando Norris", "McLaren", "+46.466s", 12, 0);
        hasilRace.addResult(5, "Meksiko", "Sergio Pérez", "Red Bull Racing", "+52.047s", 10, 0);
        hasilRace.addResult(6, "Monako", "Charles Leclerc", "Ferrari", "+59.090s", 8, 0);
        hasilRace.addResult(7, "Australia", "Daniel Ricciardo", "McLaren", "+66.004s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+67.100s", 4, 0);
        hasilRace.addResult(9, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+85.692s", 2, 0);
        hasilRace.addResult(10, "Kanada", "Lance Stroll", "Aston Martin", "+86.713s", 1, 0);
        hasilRace.addResult(11, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+88.864s", 0, 0);
        hasilRace.addResult(12, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Perancis", "Pierre Gasly", "AlphaTauri", "DNF", 0, 0);
        hasilRace.addResult(18, "Kanada", "Nicholas Latifi", "Williams", "DNF", 0, 0);
        hasilRace.addResult(19, "Spanyol", "Fernando Alonso", "Alpine", "DNF", 0, 0);
        hasilRace.addResult(20, "Rusia", "Nikita Mazepin", "Haas", "DNF", 0, 0);
        
        System.out.println("Hasil GP Bahrain");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpEmiliaRomagna(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "2:02:34.598", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+22.000s", 19, 0);
        hasilRace.addResult(3, "Britania Raya", "Lando Norris", "McLaren", "+23.702s", 15, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+25.579s", 12, 0);
        hasilRace.addResult(5, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+27.036s", 10, 0);
        hasilRace.addResult(6, "Australia", "Daniel Ricciardo", "McLaren", "+51.220s", 8, 0);
        hasilRace.addResult(7, "Perancis", "Pierre Gasly", "AlphaTauri", "+52.818s", 6, 0);
        hasilRace.addResult(8, "Kanada", "Lance Stroll", "Aston Martin", "+56.909s", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+65.704s", 2, 0);
        hasilRace.addResult(10, "Spanyol", "Fernando Alonso", "Alpine", "+66.561s", 1, 0);
        hasilRace.addResult(11, "Meksiko", "Sergio Pérez", "Red Bull", "+67.151s", 0, 0);
        hasilRace.addResult(12, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+73.184s", 0, 0);
        hasilRace.addResult(13, "Finlandia", "Kimi RäikkAönen", "Alfa Romeo", "+94.773s", 0, 0);
        hasilRace.addResult(14, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Jerman", "Sebastian Vettel", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Finlandia", "Valtteri Bottas", "Mercedes", "DNF", 0, 0);
        hasilRace.addResult(19, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(20, "Kanada", "Nicholas Latifi", "Williams", "DNF", 0, 0);
        

        System.out.println("Hasil GP Emilia Romagna");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();

    }

    static void gpPortugal(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:34:31.421", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+29.148s", 18, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+33.530s", 16, 0);
        hasilRace.addResult(4, "Meksiko", "Sergio Pérez", "Red Bull", "+39.735s", 12, 0);
        hasilRace.addResult(5, "Britania Raya", "Lando Norris", "McLaren", "+51.369s", 10, 0);
        hasilRace.addResult(6, "Monako", "Charles Leclerc", "Ferrari", "+55.781s", 8, 0);
        hasilRace.addResult(7, "Perancis", "Esteban Ocon", "Alpine", "+63.749s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Fernando Alonso", "Alpine", "+64.808s", 4, 0);
        hasilRace.addResult(9, "Australia", "Daniel Ricciardo", "McLaren", "+75.369s", 2, 0);
        hasilRace.addResult(10, "Perancis", "Pierre Gasly", "AlphaTauri", "+76.463s", 1, 0);
        hasilRace.addResult(11, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+78.955s", 0, 0);
        hasilRace.addResult(12, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Kanada", "Nicholas Latifi", "Williams", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(20, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "DNF", 0, 0);
        
        System.out.println("Hasil GP Portugal");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpSpanyol(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:33:07.680", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+15.841s", 19, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+26.610s", 15, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+54.616s", 12, 0);
        hasilRace.addResult(5, "Meksiko", "Sergio Pérez", "Red Bull", "+63.671s", 10, 0);
        hasilRace.addResult(6, "Australia", "Daniel Ricciardo", "McLaren", "+73.768s", 8, 0);
        hasilRace.addResult(7, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+74.670s", 6, 0);
        hasilRace.addResult(8, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Perancis", "Pierre Gasly", "AlphaTauri", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(20, "Jepang", "Yuki Tsunoda", "AlphaTauri", "DNF", 0, 0);
        
        System.out.println("Hasil GP Spanyol");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpMonako(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:38:56.820", 25, 1);
        hasilRace.addResult(2, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+8.968s", 18, 0);
        hasilRace.addResult(3, "Britania Raya", "Lando Norris", "McLaren", "+19.427s", 15, 0);
        hasilRace.addResult(4, "Meksiko", "Sergio Pérez", "Red Bull", "+20.490s", 12, 0);
        hasilRace.addResult(5, "Jerman", "Sebastian Vettel", "Aston Martin", "+52.591s", 10, 0);
        hasilRace.addResult(6, "Perancis", "Pierre Gasly", "AlphaTauri", "+53.896s", 8, 0);
        hasilRace.addResult(7, "Britania Raya", "Lewis Hamilton", "Mercedes", "+68.231s", 7, 0);
        hasilRace.addResult(8, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+3 Putaran", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+3 Putaran", 0, 0);
        hasilRace.addResult(19, "Finlandia", "Valtteri Bottas", "Mercedes", "DNF", 0, 0);
        hasilRace.addResult(20, "Monako", "Charles Leclerc", "Ferrari", "DNF", 0, 0);
        
        System.out.println("Hasil GP Monako");
        hasilRace.printHasilRace();;
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpAzerbaijan(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Meksiko", "Sergio Pérez", "Red Bull", "2:13:36.410", 25, 1);
        hasilRace.addResult(2, "Jerman", "Sebastian Vettel", "Aston Martin", "+1.385s", 18, 0);
        hasilRace.addResult(3, "Perancis", "Pierre Gasly", "AlphaTauri", "+2.762s", 15, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+3.828s", 12, 0);
        hasilRace.addResult(5, "Britania Raya", "Lando Norris", "McLaren", "+4.754s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Fernando Alonso", "Alpine", "+6.382s", 8, 0);
        hasilRace.addResult(7, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+6.624s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+7.709s", 4, 0);
        hasilRace.addResult(9, "Australia", "Daniel Ricciardo", "McLaren", "+8.874s", 2, 0);
        hasilRace.addResult(10, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+9.576s", 1, 0);
        hasilRace.addResult(11, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+10.254s", 0, 0);
        hasilRace.addResult(12, "Finlandia", "Valtteri Bottas", "Mercedes", "+11.264s", 0, 0);
        hasilRace.addResult(13, "Jerman", "Mick Schumacher", "Haas", "+14.241s", 0, 0);
        hasilRace.addResult(14, "Rusia", "Nikita Mazepin", "Haas", "+14.315s", 0, 0);
        hasilRace.addResult(15, "Britania Raya", "Lewis Hamilton", "Mercedes", "+17.668s", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "+42.379s", 0, 0);
        hasilRace.addResult(17, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(18, "Belanda", "Max Verstappen", "Red Bull", "DNF", 0, 0);
        hasilRace.addResult(19, "Kanada", "Lance Stroll", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(20, "Perancis", "Esteban Ocon", "Alpine", "DNF", 0, 0);
        
        System.out.println("Hasil GP Azerbaijan");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpPerancis(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:27:25.770", 26, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+2.904s", 18, 0);
        hasilRace.addResult(3, "Meksiko", "Sergio Pérez", "Red Bull", "+8.811s", 15, 0);
        hasilRace.addResult(4, "Finlandia", "Valtteri Bottas", "Mercedes", "+14.618s", 12, 0);
        hasilRace.addResult(5, "Britania Raya", "Lando Norris", "McLaren", "+64.032s", 10, 0);
        hasilRace.addResult(6, "Australia", "Daniel Ricciardo", "McLaren", "+75.857s", 8, 0);
        hasilRace.addResult(7, "Perancis", "Pierre Gasly", "AlphaTauri", "+76.596s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Fernando Alonso", "Alpine", "+77.695s", 4, 0);
        hasilRace.addResult(9, "Jerman", "Sebastian Vettel", "Aston Martin", "+79.666s", 2, 0);
        hasilRace.addResult(10, "Kanada", "Lance Stroll", "Aston Martin", "+91.946s", 1, 0);
        hasilRace.addResult(11, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+99.337s", 0, 0);
        hasilRace.addResult(12, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Monako", "Charles Leclerc", "Ferrari", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(18, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(19, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(20, "Rusia", "Nikita Mazepin", "Haas", "+1 Putaran", 0, 0);
        
        System.out.println("Hasil GP Perancis");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpSteiermark(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:22:18.925", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+35.743s", 19, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+46.907s", 15, 0);
        hasilRace.addResult(4, "Meksiko", "Sergio Pérez", "Red Bull", "+47.434s", 12, 0);
        hasilRace.addResult(5, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+1 Putaran", 8, 0);
        hasilRace.addResult(7, "Monako", "Charles Leclerc", "Ferrari", "+1 Putaran", 6, 0);
        hasilRace.addResult(8, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(17, "Kanada", "Nicholas Latifi", "Williams", "+3 Putaran", 0, 0);
        hasilRace.addResult(18, "Rusia", "Nikita Mazepin", "Haas", "+3 Putaran", 0, 0);
        hasilRace.addResult(19, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(20, "Perancis", "Pierre Gasly", "AlphaTauri", "DNF", 0, 0);
        
        System.out.println("Hasil GP Steiemark");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpAustria(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:23:54.543", 26, 1);
        hasilRace.addResult(2, "Finlandia", "Valtteri Bottas", "Mercedes", "+17.973s", 18, 0);
        hasilRace.addResult(3, "Britania Raya", "Lando Norris", "McLaren", "+20.019s", 15, 0);
        hasilRace.addResult(4, "Britania Raya", "Lewis Hamilton", "Mercedes", "+46.452s", 12, 0);
        hasilRace.addResult(5, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+57.144s", 10, 0);
        hasilRace.addResult(6, "Meksiko", "Sergio Pérez", "Red Bull", "+57.915s", 8, 0);
        hasilRace.addResult(7, "Australia", "Daniel Ricciardo", "McLaren", "+60.395s", 6, 0);
        hasilRace.addResult(8, "Monako", "Charles Leclerc", "Ferrari", "+61.195s", 4, 0);
        hasilRace.addResult(9, "Perancis", "Pierre Gasly", "AlphaTauri", "+61.844s", 2, 0);
        hasilRace.addResult(10, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Jerman", "Sebastian Vettel", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(20, "Perancis", "Esteban Ocon", "Alpine", "DNF", 0, 0);

        System.out.println("Hasil GP Austria");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
        
    }

    static void gpBritania(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:58:23.284", 27, 1);
        hasilRace.addResult(2, "Monako", "Charles Leclerc", "Ferrari", "+3.871s", 18, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+11.125s", 16, 0);
        hasilRace.addResult(4, "Britania Raya", "Lando Norris", "McLaren", "+28.573s", 12, 0);
        hasilRace.addResult(5, "Australia", "Daniel Ricciardo", "McLaren", "+42.624s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+43.454s", 8, 0);
        hasilRace.addResult(7, "Spanyol", "Fernando Alonso", "Alpine", "+72.093s", 6, 0);
        hasilRace.addResult(8, "Kanada", "Lance Stroll", "Aston Martin", "+74.289s", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+76.162s", 2, 0);
        hasilRace.addResult(10, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+82.065s", 1, 0);
        hasilRace.addResult(11, "Perancis", "Pierre Gasly", "AlphaTauri", "+85.327s", 0, 0);
        hasilRace.addResult(12, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Meksiko", "Sergio Pérez", "Red Bull", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(19, "Jerman", "Sebastian Vettel", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(20, "Belanda", "Max Verstappen", "Red Bull", "DNF", 3, 0);
        
        System.out.println("Hasil GP Britania");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpHungaria(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Perancis", "Esteban Ocon", "Alpine", "2:04:43.199", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+2.736s", 18, 0);
        hasilRace.addResult(3, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+15.018s", 15, 0);
        hasilRace.addResult(4, "Spanyol", "Fernando Alonso", "Alpine", "+15.651s", 12, 0);
        hasilRace.addResult(5, "Perancis", "Pierre Gasly", "AlphaTauri", "+63.614s", 11, 0);
        hasilRace.addResult(6, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+75.803s", 8, 0);
        hasilRace.addResult(7, "Kanada", "Nicholas Latifi", "Williams", "+77.910s", 6, 0);
        hasilRace.addResult(8, "Britania Raya", "George Russell", "Williams", "+79.094s", 4, 0);
        hasilRace.addResult(9, "Belanda", "Max Verstappen", "Red Bull", "+80.244s", 2, 0);
        hasilRace.addResult(10, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Rusia", "Nikita Mazepin", "Haas", "DNF", 0, 0);
        hasilRace.addResult(15, "Britania Raya", "Lando Norris", "McLaren", "DNF", 0, 0);
        hasilRace.addResult(16, "Finlandia", "Valtteri Bottas", "Mercedes", "DNF", 0, 0);
        hasilRace.addResult(17, "Meksiko", "Sergio Pérez", "Red Bull", "DNF", 0, 0);
        hasilRace.addResult(18, "Monako", "Charles Leclerc", "Ferrari", "DNF", 0, 0);
        hasilRace.addResult(19, "Kanada", "Lance Stroll", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(20, "Jerman", "Sebastian Vettel", "Aston Martin", "Didiskualifikasi", 0, 0);
        

        System.out.println("Hasil GP Hungaria");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpBelgia(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "0:03:27.071", 12, 1);
        hasilRace.addResult(2, "Britania Raya", "George Russell", "Williams", "+1.995s", 9, 0);
        hasilRace.addResult(3, "Britania Raya", "Lewis Hamilton", "Mercedes", "+2.601s", 7, 0);
        hasilRace.addResult(4, "Australia", "Daniel Ricciardo", "McLaren", "+4.496s", 6, 0);
        hasilRace.addResult(5, "Jerman", "Sebastian Vettel", "Aston Martin", "+7.479s", 5, 0);
        hasilRace.addResult(6, "Perancis", "Pierre Gasly", "AlphaTauri", "+10.177s", 4, 0);
        hasilRace.addResult(7, "Perancis", "Esteban Ocon", "Alpine", "+11.579s", 3, 0);
        hasilRace.addResult(8, "Monako", "Charles Leclerc", "Ferrari", "+12.608s", 2, 0);
        hasilRace.addResult(9, "Kanada", "Nicholas Latifi", "Williams", "+15.484s", 1, 0);
        hasilRace.addResult(10, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+16.166s", 1, 0);
        hasilRace.addResult(11, "Spanyol", "Fernando Alonso", "Alpine", "+20.590s", 0, 0);
        hasilRace.addResult(12, "Finlandia", "Valtteri Bottas", "Mercedes", "+22.414s", 0, 0);
        hasilRace.addResult(13, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+24.163s", 0, 0);
        hasilRace.addResult(14, "Britania Raya", "Lando Norris", "McLaren", "+27.109s", 0, 0);
        hasilRace.addResult(15, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+28.329s", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+29.507s", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+31.993s", 0, 0);
        hasilRace.addResult(18, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+36.054s", 0, 0);
        hasilRace.addResult(19, "Meksiko", "Sergio Pérez", "Red Bull", "+38.205s", 0, 0);
        hasilRace.addResult(20, "Kanada", "Lance Stroll", "Aston Martin", "+44.108s", 0, 0);
        

        System.out.println("Hasil GP Belgia");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpBelanda(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:30:05.395", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+20.932s", 19, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+56.460s", 15, 0);
        hasilRace.addResult(4, "Perancis", "Pierre Gasly", "AlphaTauri", "+1 Putaran", 12, 0);
        hasilRace.addResult(5, "Monako", "Charles Leclerc", "Ferrari", "+1 Putaran", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 8, 0);
        hasilRace.addResult(7, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+1 Putaran", 6, 0);
        hasilRace.addResult(8, "Meksiko", "Sergio Pérez", "Red Bull", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Kanada", "Lance Stroll", "Aston Martin", "+2 Putaran", 0, 0);
        hasilRace.addResult(13, "Jerman", "Sebastian Vettel", "Aston Martin", "+2 Putaran", 0, 0);
        hasilRace.addResult(14, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+2 Putaran", 0, 0);
        hasilRace.addResult(15, "Polandia", "Robert Kubica", "Alfa Romeo", "+2 Putaran", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "+2 Putaran", 0, 0);
        hasilRace.addResult(17, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+3 Putaran", 0, 0);
        hasilRace.addResult(19, "Jepang", "Yuki Tsunoda", "AlphaTauri", "DNF", 0, 0);
        hasilRace.addResult(20, "Rusia", "Nikita Mazepin", "Haas", "DNF", 0, 0);
        

        System.out.println("Hasil GP Belanda");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpItalia(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Australia", "Daniel Ricciardo", "McLaren", "1:21:54.365", 27, 1);
        hasilRace.addResult(2, "Britania Raya", "Lando Norris", "McLaren", "+1.747s", 18, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+4.921s", 18, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+7.309s", 12, 0);
        hasilRace.addResult(5, "Meksiko", "Sergio Pérez", "Red Bull", "+8.723s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+10.535s", 8, 0);
        hasilRace.addResult(7, "Kanada", "Lance Stroll", "Aston Martin", "+15.804s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Fernando Alonso", "Alpine", "+17.201s", 4, 0);
        hasilRace.addResult(9, "Britania Raya", "George Russell", "Williams", "+19.742s", 2, 0);
        hasilRace.addResult(10, "Perancis", "Esteban Ocon", "Alpine", "+20.868s", 1, 0);
        hasilRace.addResult(11, "Kanada", "Nicholas Latifi", "Williams", "+23.743s", 0, 0);
        hasilRace.addResult(12, "Jerman", "Sebastian Vettel", "Aston Martin", "+24.621s", 0, 0);
        hasilRace.addResult(13, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+27.216s", 0, 0);
        hasilRace.addResult(14, "Polandia", "Robert Kubica", "Alfa Romeo", "+29.769s", 0, 0);
        hasilRace.addResult(15, "Jerman", "Mick Schumacher", "Haas", "+51.088s", 0, 0);
        hasilRace.addResult(16, "Rusia", "Nikita Mazepin", "Haas", "DNF", 0, 0);
        hasilRace.addResult(17, "Britania Raya", "Lewis Hamilton", "Mercedes", "DNF", 0, 0);
        hasilRace.addResult(18, "Belanda", "Max Verstappen", "Red Bull", "DNF", 2, 0);
        hasilRace.addResult(19, "Perancis", "Pierre Gasly", "AlphaTauri", "DNF", 0, 0);
        hasilRace.addResult(20, "Jepang", "Yuki Tsunoda", "AlphaTauri", "DNF", 0, 0);
        

        System.out.println("Hasil GP Italia");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpRussia(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:30:41.001", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+53.271s", 18, 0);
        hasilRace.addResult(3, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+62.475s", 15, 0);
        hasilRace.addResult(4, "Australia", "Daniel Ricciardo", "McLaren", "+65.607s", 12, 0);
        hasilRace.addResult(5, "Finlandia", "Valtteri Bottas", "Mercedes", "+67.533s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Fernando Alonso", "Alpine", "+81.321s", 8, 0);
        hasilRace.addResult(7, "Britania Raya", "Lando Norris", "McLaren", "+87.224s", 7, 0);
        hasilRace.addResult(8, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+88.955s", 4, 0);
        hasilRace.addResult(9, "Meksiko", "Sergio Pérez", "Red Bull", "+90.076s", 2, 0);
        hasilRace.addResult(10, "Britania Raya", "George Russell", "Williams", "+100.551s", 1, 0);
        hasilRace.addResult(11, "Kanada", "Lance Stroll", "Aston Martin", "+106.198s", 0, 0);
        hasilRace.addResult(12, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Perancis", "Pierre Gasly", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Monako", "Charles Leclerc", "Ferrari", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(18, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Kanada", "Nicholas Latifi", "Williams", "DNF", 0, 0);
        hasilRace.addResult(20, "Jerman", "Mick Schumacher", "Haas", "DNF", 0, 0);
        

        System.out.println("Hasil GP Russia");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpTurki(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Finlandia", "Valtteri Bottas", "Mercedes", "1:31:04.103", 26, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+14.584s", 18, 0);
        hasilRace.addResult(3, "Meksiko", "Sergio Pérez", "Red Bull", "+33.471s", 15, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+37.814s", 12, 0);
        hasilRace.addResult(5, "Britania Raya", "Lewis Hamilton", "Mercedes", "+41.812s", 10, 0);
        hasilRace.addResult(6, "Perancis", "Pierre Gasly", "AlphaTauri", "+44.292s", 8, 0);
        hasilRace.addResult(7, "Britania Raya", "Lando Norris", "McLaren", "+47.213s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+51.526s", 4, 0);
        hasilRace.addResult(9, "Kanada", "Lance Stroll", "Aston Martin", "+82.018s", 2, 0);
        hasilRace.addResult(10, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(18, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(19, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(20, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        

        System.out.println("Hasil GP Turki");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpUS(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:34:36.552", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+1.333s", 19, 0);
        hasilRace.addResult(3, "Meksiko", "Sergio Pérez", "Red Bull", "+42.223s", 15, 0);
        hasilRace.addResult(4, "Monako", "Charles Leclerc", "Ferrari", "+52.246s", 12, 0);
        hasilRace.addResult(5, "Australia", "Daniel Ricciardo", "McLaren", "+76.854s", 10, 0);
        hasilRace.addResult(6, "Finlandia", "Valtteri Bottas", "Mercedes", "+80.128s", 8, 0);
        hasilRace.addResult(7, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+83.545s", 6, 0);
        hasilRace.addResult(8, "Britania Raya", "Lando Norris", "McLaren", "+84.395s", 4, 0);
        hasilRace.addResult(9, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Spanyol", "Fernando Alonso", "Alpine", "DNF", 0, 0);
        hasilRace.addResult(19, "Perancis", "Esteban Ocon", "Alpine", "DNF", 0, 0);
        hasilRace.addResult(20, "Perancis", "Pierre Gasly", "AlphaTauri", "DNF", 0, 0);
        

        System.out.println("Hasil GP US");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpMeksiko(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:38:39.086", 25, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+16.555s", 18, 0);
        hasilRace.addResult(3, "Meksiko", "Sergio Pérez", "Red Bull", "+17.752s", 15, 0);
        hasilRace.addResult(4, "Perancis", "Pierre Gasly", "AlphaTauri", "+63.845s", 12, 0);
        hasilRace.addResult(5, "Monako", "Charles Leclerc", "Ferrari", "+81.037s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+1 Putaran", 8, 0);
        hasilRace.addResult(7, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 6, 0);
        hasilRace.addResult(8, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Kanada", "Lance Stroll", "Aston Martin", "+2 Putaran", 0, 0);
        hasilRace.addResult(15, "Finlandia", "Valtteri Bottas", "Mercedes", "+2 Putaran", 0, 0);
        hasilRace.addResult(16, "Britania Raya", "George Russell", "Williams", "+2 Putaran", 0, 0);
        hasilRace.addResult(17, "Kanada", "Nicholas Latifi", "Williams", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Rusia", "Nikita Mazepin", "Haas", "+3 Putaran", 0, 0);
        hasilRace.addResult(19, "Jerman", "Mick Schumacher", "Haas", "DNF", 0, 0);
        hasilRace.addResult(20, "Jepang", "Yuki Tsunoda", "AlphaTauri", "DNF", 0, 0);
        

        System.out.println("Hasil GP Meksiko");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpBrasil(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:32:22.851", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+10.496s", 20, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+13.576s", 18, 0);
        hasilRace.addResult(4, "Meksiko", "Sergio Pérez", "Red Bull", "+39.940s", 13, 0);
        hasilRace.addResult(5, "Monako", "Charles Leclerc", "Ferrari", "+49.517s", 10, 0);
        hasilRace.addResult(6, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+51.820s", 9, 0);
        hasilRace.addResult(7, "Perancis", "Pierre Gasly", "AlphaTauri", "+1 Putaran", 6, 0);
        hasilRace.addResult(8, "Perancis", "Esteban Ocon", "Alpine", "+1 Putaran", 4, 0);
        hasilRace.addResult(9, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Britania Raya", "George Russell", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Jerman", "Mick Schumacher", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Australia", "Daniel Ricciardo", "McLaren", "DNF", 0, 0);
        hasilRace.addResult(20, "Kanada", "Lance Stroll", "Aston Martin", "DNF", 0, 0);
        

        System.out.println("Hasil GP Brasil");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpQatar(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "1:24:28.471", 25, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+25.743s", 19, 0);
        hasilRace.addResult(3, "Spanyol", "Fernando Alonso", "Alpine", "+59.457s", 15, 0);
        hasilRace.addResult(4, "Meksiko", "Sergio Pérez", "Red Bull", "+62.306s", 12, 0);
        hasilRace.addResult(5, "Perancis", "Esteban Ocon", "Alpine", "+80.570s", 10, 0);
        hasilRace.addResult(6, "Kanada", "Lance Stroll", "Aston Martin", "+81.274s", 8, 0);
        hasilRace.addResult(7, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+81.911s", 6, 0);
        hasilRace.addResult(8, "Monako", "Charles Leclerc", "Ferrari", "+83.126s", 4, 0);
        hasilRace.addResult(9, "Britania Raya", "Lando Norris", "McLaren", "+1 Putaran", 2, 0);
        hasilRace.addResult(10, "Jerman", "Sebastian Vettel", "Aston Martin", "+1 Putaran", 1, 0);
        hasilRace.addResult(11, "Perancis", "Pierre Gasly", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(12, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(17, "Britania Raya", "George Russell", "Williams", "+2 Putaran", 0, 0);
        hasilRace.addResult(18, "Rusia", "Nikita Mazepin", "Haas", "+2 Putaran", 0, 0);
        hasilRace.addResult(19, "Kanada", "Nicholas Latifi", "Williams", "DNF", 0, 0);
        hasilRace.addResult(20, "Finlandia", "Valtteri Bottas", "Mercedes", "DNF", 0, 0);
        
        
        System.out.println("Hasil GP Qatar");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpSaudi(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Britania Raya", "Lewis Hamilton", "Mercedes", "2:06:15.118", 26, 1);
        hasilRace.addResult(2, "Belanda", "Max Verstappen", "Red Bull", "+21.825s", 18, 0);
        hasilRace.addResult(3, "Finlandia", "Valtteri Bottas", "Mercedes", "+27.531s", 15, 0);
        hasilRace.addResult(4, "Perancis", "Esteban Ocon", "Alpine", "+27.633s", 12, 0);
        hasilRace.addResult(5, "Australia", "Daniel Ricciardo", "McLaren", "+40.121s", 10, 0);
        hasilRace.addResult(6, "Perancis", "Pierre Gasly", "AlphaTauri", "+41.613s", 8, 0);
        hasilRace.addResult(7, "Monako", "Charles Leclerc", "Ferrari", "+44.475s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+46.606s", 4, 0);
        hasilRace.addResult(9, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "+58.505s", 2, 0);
        hasilRace.addResult(10, "Britania Raya", "Lando Norris", "McLaren", "+61.358s", 1, 0);
        hasilRace.addResult(11, "Kanada", "Lance Stroll", "Aston Martin", "+77.212s", 0, 0);
        hasilRace.addResult(12, "Kanada", "Nicholas Latifi", "Williams", "+83.249s", 0, 0);
        hasilRace.addResult(13, "Spanyol", "Fernando Alonso", "Alpine", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "+1 Putaran", 0, 0);
        hasilRace.addResult(16, "Jerman", "Sebastian Vettel", "Aston Martin", "DNF", 0, 0);
        hasilRace.addResult(17, "Meksiko", "Sergio Pérez", "Red Bull", "DNF", 0, 0);
        hasilRace.addResult(18, "Rusia", "Nikita Mazepin", "Haas", "DNF", 0, 0);
        hasilRace.addResult(19, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(20, "Jerman", "Mick Schumacher", "Haas", "DNF", 0, 0);
        

        System.out.println("Hasil GP SAudi");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }

    static void gpAbuDhabi(DLL klasemen, Race hasilRace) {
        hasilRace.addResult(1, "Belanda", "Max Verstappen", "Red Bull", "1:30:17.345", 26, 1);
        hasilRace.addResult(2, "Britania Raya", "Lewis Hamilton", "Mercedes", "+2.256s", 18, 0);
        hasilRace.addResult(3, "Spanyol", "Carlos Sainz Jr.", "Ferrari", "+5.173s", 15, 0);
        hasilRace.addResult(4, "Jepang", "Yuki Tsunoda", "AlphaTauri", "+5.692s", 12, 0);
        hasilRace.addResult(5, "Perancis", "Pierre Gasly", "AlphaTauri", "+6.531s", 10, 0);
        hasilRace.addResult(6, "Finlandia", "Valtteri Bottas", "Mercedes", "+7.463s", 8, 0);
        hasilRace.addResult(7, "Britania Raya", "Lando Norris", "McLaren", "+59.200s", 6, 0);
        hasilRace.addResult(8, "Spanyol", "Fernando Alonso", "Alpine", "+61.708s", 4, 0);
        hasilRace.addResult(9, "Perancis", "Esteban Ocon", "Alpine", "+64.026s", 2, 0);
        hasilRace.addResult(10, "Monako", "Charles Leclerc", "Ferrari", "+66.057s", 1, 0);
        hasilRace.addResult(11, "Jerman", "Sebastian Vettel", "Aston Martin", "+67.527s", 0, 0);
        hasilRace.addResult(12, "Australia", "Daniel Ricciardo", "McLaren", "+1 Putaran", 0, 0);
        hasilRace.addResult(13, "Kanada", "Lance Stroll", "Aston Martin", "+1 Putaran", 0, 0);
        hasilRace.addResult(14, "Jerman", "Mick Schumacher", "Haas", "+1 Putaran", 0, 0);
        hasilRace.addResult(15, "Meksiko", "Sergio Pérez", "Red Bull", "DNF", 0, 0);
        hasilRace.addResult(16, "Kanada", "Nicholas Latifi", "Williams", "DNF", 0, 0);
        hasilRace.addResult(17, "Italia", "Antonio Giovinazzi", "Alfa Romeo", "DNF", 0, 0);
        hasilRace.addResult(18, "Britania Raya", "George Russell", "Williams", "DNF", 0, 0);
        hasilRace.addResult(19, "Finlandia", "Kimi Räikkönen", "Alfa Romeo", "DNF", 0, 0);
        

        System.out.println("Hasil GP Abu Dhabi");
        hasilRace.printHasilRace();
        System.out.println("Klasemen Sementara setelah balapan :");
        klasemen.sortByPoints();
    }
}