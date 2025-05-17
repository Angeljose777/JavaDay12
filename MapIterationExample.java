import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Emma");
        students.put(3, "Liam");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
