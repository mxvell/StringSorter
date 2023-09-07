import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("grape");
        input.add("avocado");
        input.add("cherry");
        StringSorter sorter = new StringSorter();
        List<String> output = sorter.sortStrings(input,"a");
        for (String str : output) {
            System.out.println(str);
        }
    }
}
