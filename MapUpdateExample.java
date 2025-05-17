import java.util.HashMap;
import java.util.Map;

public class MapUpdateExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Emma");
        System.out.println("Before update: " + students);

        students.put(1, "Emily");
        System.out.println("After update: " + students);
    }
}
