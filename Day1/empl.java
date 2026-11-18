
import java.util.*;

import java.util.function.Predicate;
import java.util.function.Consumer;

public class empl {
    public static void main(String[] args) {

        List<Integer> attendance = Arrays.asList(95, 45, 80, 30, 100);

        Predicate<Integer> eligible = a -> a >= 75;

        Consumer<Integer> print = a -> System.out.println(a);

        System.out.println("Eligible Attendance Percentages:");

        attendance.forEach(a -> {
            if (eligible.test(a)) {
                print.accept(a);
            }
        });
    }
}
