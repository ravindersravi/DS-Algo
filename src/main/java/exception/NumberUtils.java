package exception;

public class NumberUtils {
    public NumberUtils() {
    }

    public static Float getFloatFromString(String number) {
        Float floatNumber = null;

        try {
            floatNumber = Float.parseFloat(number);
        } catch (NullPointerException | NumberFormatException var3) {
            System.out.println("exception found");
        }

        return floatNumber;
    }

}
