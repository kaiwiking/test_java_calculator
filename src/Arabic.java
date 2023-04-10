public class Arabic {
    int toDecimal(String ar_num){ return Integer.parseInt(ar_num); }
    String add(String num1, String num2){ return String.valueOf((toDecimal(num1) + toDecimal(num2))); }
    String sub(String num1, String num2){
        return String.valueOf(toDecimal(num1) - toDecimal(num2));
    }
    String mul(String num1, String num2){ return String.valueOf(toDecimal(num1) * toDecimal(num2)); }
    String divs(String num1, String num2){ return String.valueOf((toDecimal(num1) / toDecimal(num2))); }
}
