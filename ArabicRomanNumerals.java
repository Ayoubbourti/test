package nombres;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArabicRomanNumerals {


    static enum RomanLiteral {

        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        int value;

        private RomanLiteral(int value) {
            this.value = value;
        }
    }


    public static List<RomanLiteral> literalsDecrementOrder() {
        List<RomanLiteral> literals = Arrays.asList(RomanLiteral.values());
        return literals; // L'ordre est déjà décroissant
    }


    public String convert(int nombre) {
        StringBuilder resultat = new StringBuilder();

        int reste = nombre;

        for (RomanLiteral literal : literalsDecrementOrder()) {
            while (reste >= literal.value) {
                resultat.append(literal.name());
                reste -= literal.value;
            }
        }

        return resultat.toString();
    }
}
