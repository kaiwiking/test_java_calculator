import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String ex = sc.nextLine();

        String res = calc(ex);

        System.out.print(res);
        sc.close();
    }

    public static String calc(String input) throws Exception {
        String[] ex = input.split("\\s");
        if (ex.length > 3) throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        else if (ex.length < 3) throw new Exception("строка не является математической операцией");
        else {
            Numbers numbs = new Numbers();
            numbs.current_operation = ex[1];
            numbs.value1 = ex[0];
            numbs.value2 = ex[2];
            return numbs.operate();
        }
    }
}

