package java17features.textblock;

public class FormattedSample {
    public static void main(String[] args) {

        String department = "Engineering";
        String status = "ACTIVE";

        String query = """
                SELECT id, name, age
                FROM employees
                WHERE department = '%s'
                AND status = '%s'
                ORDER BY name ASC
                """.formatted(department, status);

        System.out.println(query);

    }
}