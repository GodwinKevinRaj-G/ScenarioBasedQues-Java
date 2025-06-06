package java17features.switchusecases;

public class SwitchEnhancement {
    public static void main(String[] args) {
        String player = "Xavi";

        String worldCupStatus = switch (player) {
            case "Messi" -> "WorldCup 1";
            case "Xavi", "Iniesta" -> {
                System.out.println("Spanish Midfield Maestro");
                yield "WorldCup 1";
            }
            case "Buffon", "Neuer" -> {
                yield "WorldCup 1";
            }
            default -> "No World Cup";
        };

        System.out.println("Result: " + worldCupStatus);
    }
}

