package nombres;

public class ArabicRomanNumerals {
    public String convert(int nombre) {
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < nombre / 10; i++) {
            resultat.append("X");
        }
        for (int i = 0; i < nombre % 10; i++) {
            resultat.append("I");
        }

        return resultat.toString();
    }  }

