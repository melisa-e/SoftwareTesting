import junit.framework.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest extends TestCase{

    /**
     * Theoretisch noch Testfaelle in dem beispielsweise Stringeingaben geprueft werden.
     * Ich weiß nicht genau wie ich negative Cases testen soll.
     * Die mir einfallen sind zumindest: Eingabe von Null, Eingabe vom falschen Datentyp, leere Eingabe
     *
     * Ansonsten habe ich sowohl die Eingaben, als auch die Ergebnisse geprüft, sodass jede Kombination und Möglichkeit
     * getestet wird, was beispielsweise Vorzeichen angeht.
     */

    @Test
    public void testAdd() {
        double expectedPositive = 3;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositive, Taschenrechner.add(2,1));
        //assertNull("Es kommt nicht null raus.", Taschenrechner.add(null, null));

        double expectedPositiveNegative = 1;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositiveNegative, Taschenrechner.add(5,(-4)));

        double expectedNegative = (-5);
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedNegative, Taschenrechner.add((-1),(-4)));

        double expectedWithDecimal = 2.2;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedWithDecimal, Taschenrechner.add(1.5,0.7));
    }

    @Test
    public void testSub() {
        double expectedPositive = 3;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositive, Taschenrechner.sub(5,2));

        double expectedPositiveNegative = 5;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositiveNegative, Taschenrechner.sub(1,(-4)));

        double expectedNegative = 2;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedNegative, Taschenrechner.sub((-2),(-4)));

        double expectedNegativeResult = (-2);
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedNegativeResult, Taschenrechner.sub(1,3));

        double expectedWithDecimal = 2.2;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedWithDecimal, Taschenrechner.sub(3,0.8));
    }

    @Test
    public void testMult() {
        double expectedPositive = 6;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositive, Taschenrechner.mult(3,2));

        double expectedPositiveNegative = (-6);
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositiveNegative, Taschenrechner.mult(3,(-2)));

        double expectedNegative = 6;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedNegative, Taschenrechner.mult((-2),(-3)));

        double expectedWithDecimal = 8.1;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedWithDecimal, Taschenrechner.mult(3,2.7));
    }

    @Test
    public void testDiv() {
        double expectedPositive = 3;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositive, Taschenrechner.div(6,2));

        double expectedPositiveNegative = (-3);
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedPositiveNegative, Taschenrechner.div(6,(-2)));

        double expectedNegative = 3;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedNegative, Taschenrechner.div((-6),(-2)));

        double expectedWithDecimal = 1.75;
        assertEquals("Der tatsaechliche Wert entspricht nicht der Erwartung", expectedWithDecimal, Taschenrechner.div(5.6,3.2));
    }

}

