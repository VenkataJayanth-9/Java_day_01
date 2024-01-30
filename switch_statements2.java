import java.util.Scanner;

// In this file, we are using Enhanced Switch Expressions.
public class switch_statements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month in which you were born: ");
        String month = sc.nextLine();

        String result = switch (month.toUpperCase()) {
            case "JANUARY", "FEBRUARY", "DECEMBER" -> {
                yield "Cool, you were born in Winter.";
            }
            case "MARCH", "APRIL", "MAY" -> "Hot guy. You were born in Summer.";
            case "JUNE", "JULY", "AUGUST", "SEPTEMBER", "NOVEMBER" -> "You're as cool as ice and as hot as fire, you were born in Monsoon.";
            default -> {
                yield "Invalid";
            }
        };

        System.out.println(result);
    }
}
