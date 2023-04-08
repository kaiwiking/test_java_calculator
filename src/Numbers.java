import java.util.Arrays;

public class Numbers {
    String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    String current_operation, value1, value2;

    boolean is_arabic(String value){
        return Arrays.asList(arabic).contains(value);
    }
    boolean is_roman(String value){
        return Arrays.asList(roman).contains(value);
    }

    String operate() throws Exception {
        if (is_arabic(value1) && is_arabic(value2)){
            Arabic arabic_c = new Arabic();
            switch(current_operation){
                case("+"): return arabic_c.add(value1, value2);
                case("-"): return arabic_c.sub(value1, value2);
                case("*"): return arabic_c.mul(value1, value2);
                case("/"): return arabic_c.divs(value1, value2);
            }
        }
        else if (is_roman(value1) && is_roman(value2)){
            Roman roman_c = new Roman();
            switch(current_operation){
                case("+"): return roman_c.add(value1, value2);
                case("-"): return roman_c.sub(value1, value2);
                case("*"): return roman_c.mul(value1, value2);
                case("/"): return roman_c.divs(value1, value2);
            }
        }
        else throw new Exception("используются одновременно разные системы счисления");
        return null;
    }

}
