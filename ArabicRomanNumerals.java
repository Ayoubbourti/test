package nombres;

public class ArabicRomanNumerals {
    
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

