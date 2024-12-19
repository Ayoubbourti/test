package nombres;
import java.util.Arrays;
import java.util.List;

public class ArabicRomanNumerals {


    static enum RomanLiteral {
        L(50),
        XLIX(49),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        int value;

        private RomanLiteral(int value) {
            this.value = value;
        }

        public static List<RomanLiteral> literalsDecrementOrder() {
            return Arrays.asList(RomanLiteral.values());
        }
    }


    static class ResultatBuilder {
        int reste;
        StringBuilder resultat = new StringBuilder();

        public ResultatBuilder(int reste) {
            this.reste = reste;
        }

        public void compute(RomanLiteral literal) {
            while (reste >= literal.value) {
                resultat.append(literal.name());
                reste -= literal.value;
            }
        }

        public String format() {
            return resultat.toString();
        }
    }



    public String convert(int i) {
        if (i < 1 || i > 50) {
            throw new IllegalArgumentException("Number must be between 1 and 50");
        }

        ResultatBuilder resultat = new ResultatBuilder(i);
        for (RomanLiteral literal :
                RomanLiteral.literalsDecrementOrder()) {
            resultat.compute(literal);
        }
        return resultat.format();
    }
}
