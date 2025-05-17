import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map<String, String> config = Map.of(
            "env", "production",
            "version", "1.0",
            "mode", "dark"
        );

        System.out.println("Immutable Config: " + config);

        // Uncommenting the next line will throw UnsupportedOperationException
        // config.put("env", "development");
    }
}
