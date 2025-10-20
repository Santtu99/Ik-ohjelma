public class IkaOhjelma {
    public static void main(String[] args) {

        int ika = 65; // Kokeile eri arvoja!

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

            if (ika >= 16) {
                System.out.println("Saat ajaa kevaria");
            }

        } else if (ika >= 18 && ika < 65) {

            if (ika == 18) {
                System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa!");
            } else {
                System.out.println("Olet aikuinen");
            }

            // Tasavuosikymmenet
            if (ika % 10 == 0) {
                System.out.println("Onnea tasavuosikymmenistä!");
            }

            // 40–50-vuotiaille
            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");
            }

            // Varhaiseläke
            if (ika > 58) {
                System.out.println("Voit halutessasi mennä varhaiseläkkeelle.");
            }

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

            if (ika == 65) {
                System.out.println("Hyviä eläkepäiviä!");
            }

            if (ika == 100) {
                System.out.println("🎉 Onnea satavuotiaalle!");
                System.out.println("Olet todellinen legenda!");
                System.out.println("Kiitos, että olet jakanut viisauttasi maailmalle.");
            }

        } else {
            System.out.println("Virheellinen ikä!");
        }
    }
}
