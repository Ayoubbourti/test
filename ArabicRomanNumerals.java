package nombres;

public class ArabicRomanNumerals {

    public String convert(int i){
        StringBuilder resultat = new StringBuilder();

        for(int j=0;j<i;j++){
            resultat.append("I");
        }
        return resultat.toString();
    } }
