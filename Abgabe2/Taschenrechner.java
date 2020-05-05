
public class Taschenrechner {

    /**
     * Annahme, dass nur mit zwei Variablen gerechnet werden soll
     * Ansonsten würde man ein Array als Eingabe haben und über eine Schleifen die jeweiligen Variablen berechnen.
     */

    /*
    Hilffunktion aus dem Internet; Quelle: https://wiki.byte-welt.net/wiki/Flie%C3%9Fkommazahlen_mit_Java_runden
     */
    static double round(double value, int decimalPoints) {
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }

    static double add(double x, double y) {
        double erg = x + y;
        return erg;
    }

    static double sub(double x, double y) {
        double erg = x - y;
        return erg;
    }

    static double mult(double x, double y) {
        double erg = x * y;
        return round(erg, 2);
    }

    static double div(double x, double y) {
        double erg = 0;
        try {
            erg = x / y;
            System.out.println(erg);
        } catch (ArithmeticException ae){   }

        return round(erg, 2);
    }

    public static void main(String[] args) {
        add(3, 3);
        sub(2, 3.2);
        mult(2, 6.3);
        div(3, 0);

        /**
         * Ich wollte checken, dass die Eingabe wirklich eine Zahl und nicht vom Typen String ist,
         * allerdings wusste ich nicht wo genau ich das checken soll, da schon bei einer falschen Eingabe ein Error
         * geworfen wird, da der Typ Double gefordert wird. Zudem soll die Funktion laut Google x.getClass().getName()
         * heißen, wobei dies nicht erkannt wird.
         * Ich habe Double ausgewählt, da die Aufgabenstellung hieß, die Funktionen sollen für Integer und Float
         * funktionieren und da ich gelesen habe, dass Int und Float beide zu Double convertiert werden bevor
         * die Rechnung ausgeführt wird, lass ich die Eingabe direkt als Double gelten.
         * Quelle: http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/mixed.html
         */
    }

}
