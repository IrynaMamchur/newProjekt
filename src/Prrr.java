import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prrr {
    public static void main(String[] args) {
        IntStream.range(2, 7)
                .dropWhile(x -> x < 5
                )
                .forEach(System.out::println);
// 5, 6

        IntStream.of(1, 3, 2, 0, 5, 4)
                .dropWhile(x -> x %
                        2 == 1)
                .forEach(System.out::println);
// 2, 0, 5, 6
    }
}
