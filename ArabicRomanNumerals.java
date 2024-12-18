package nombres;

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

            while (reste >= 10) {
                resultat.append("X");
                reste -= 10;
            }
            while (reste >= 1) {
                resultat.append("I");
                reste -= 1;
            }

            return resultat.toString();
        }  }

