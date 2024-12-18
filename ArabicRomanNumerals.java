package nombres;

public class ArabicRomanNumerals {

    public String convert(int nombre) {
        StringBuilder resultat = new StringBuilder();

        if (nombre >= 10) {
            for (int i = 0; i < nombre/10; i++) {
                resultat.append("X");
            }
        } else {
            for (int i = 0; i < nombre; i++) {
                resultat.append("I");
            }
        }

        return resultat.toString();
    }   }

