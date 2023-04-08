import java.util.Arrays;

public class Roman {
    String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

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
