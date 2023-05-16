import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //el metodo reduce calcula la suma usando la funcion de flecha
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
    }
}