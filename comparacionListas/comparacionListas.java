import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        boolean equal = list1.equals(list2);

        System.out.println("Lists are equal: " + equal);
    }
}
