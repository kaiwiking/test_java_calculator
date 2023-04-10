import java.util.Arrays;

public class Roman {
    String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
            "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    int toDecimal(String rom_num){ return Arrays.asList(roman).indexOf(rom_num) + 1; }
    String toRoman(String dec_num) throws Exception {
        try{
            return roman[Integer.parseInt(dec_num) - 1];
        }
        catch (Exception e){
            throw new Exception("в римской системе нет отрицательных чисел");
        }

    }

    String add(String num1, String num2) throws Exception {
        return toRoman(String.valueOf((toDecimal(num1) + toDecimal(num2))));
    }
    String sub(String num1, String num2) throws Exception {
        return toRoman(String.valueOf(toDecimal(num1) - toDecimal(num2)));
    }
    String mul(String num1, String num2) throws Exception {
        return toRoman(String.valueOf(toDecimal(num1) * toDecimal(num2)));
    }
    String divs(String num1, String num2)  throws Exception {
        return toRoman(String.valueOf((toDecimal(num1) / toDecimal(num2))));
    }
}
