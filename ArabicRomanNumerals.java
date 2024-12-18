package nombres;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArabicRomanNumerals {

    static enum RomanLiteral {
        I(1),
        X(10),
        ;

        int value;

        private RomanLiteral(int value) {
            this.value = value;
        }
    }
    public String convert(int nombre) {
        StringBuilder resultat = new StringBuilder();

        int reste = nombre;

        List<RomanLiteral> literals = Arrays.asList(RomanLiteral.values());
        Collections.reverse(literals);

        for (RomanLiteral literal : literals) {
            while (reste > literal.value) {
                resultat.append(literal.name());
                reste -= literal.value;
            }
        }

        return resultat.toString();
    }  }

