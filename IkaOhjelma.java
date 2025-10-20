public class IkaOhjelma {
    public static void main(String[] args) {

        int ika = 16; // Kokeile eri arvoja

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            // Mopon ajaminen 15-vuotiaana
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

            // Kevarin ajaminen 16–17-vuotiaana
            if (ika >= 16) {
                System.out.println("Saat ajaa kevaria");
            }

        } else if (ika >= 18) {
            // Täysi-ikäisyys ja auton ajaminen
            if (ika == 18) {
                System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa!");
            } else {
                System.out.println("Olet aikuinen");
            }
        } else {
            System.out.println("Virheellinen ikä!");
        }
    }
}