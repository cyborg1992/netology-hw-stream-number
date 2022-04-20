import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredSortedList = new ArrayList<>();
        for (Integer item : list) {
            if ((item > 0) && (item % 2 == 0)) {
                filteredSortedList.add(item);
            }
        }
        Collections.sort(filteredSortedList);
        filteredSortedList.forEach(System.out::println);
    }
}
