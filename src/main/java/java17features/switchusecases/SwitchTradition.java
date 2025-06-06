package java17features.switchusecases;

public class SwitchTradition {
    public static void main(String[] args) {
        String day = "MONDAY";
        int result;

        switch (day) {
            case "MONDAY":
                result = 1;
                System.out.println(result);
                break;
            case "TUESDAY":
                result = 2;
                System.out.println(result);
                break;
            default:
                result = 0;
                System.out.println(result);
        }
    }
}
