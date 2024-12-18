package nombres;

public class ArabicRomanNumerals {

    public String convert(int i){
        if(i>2){ return "III";}
        else if(i>1) {return "II" ;}
        return "I";
    }
}
