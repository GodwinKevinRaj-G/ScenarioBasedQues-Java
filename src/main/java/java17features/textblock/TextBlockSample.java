package java17features.textblock;

public class TextBlockSample {
    public static void main(String[] args) {
        String query = "SELECT id, name, age FROM employees " +
                       "WHERE department = 'Engineering' " +
                       "AND status = 'ACTIVE' " + "ORDER BY name ASC";


        String textBlock = """
                SELECT id, name, age
                FROM employees
                WHERE department = 'Engineering'
                AND status = 'ACTIVE'
                ORDER BY name ASC
                """;
    }
}
