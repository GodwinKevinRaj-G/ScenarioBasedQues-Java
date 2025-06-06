package java17features.patternmatch;

public class InstanceOfUseCase {
    public static void main(String[] args) {

        Object name = "Messi";
        if (name instanceof String) {
            int length = ((String) name).length();
            System.out.println(length);
        }

        Object s = "Kevin";
        if (s instanceof String nameList) {
            System.out.println(nameList.length());
        }
    }
}
