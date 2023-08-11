import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StreamApi {
    public static void main(String[] args) {
        Moving[] units = {
                new Humen(),
                new Plane(),
                new Ship(),
                new Moving() {
                    @Override
                    public void move() {
                        System.out.println("Anonymous slides");
                    }
                },
                ()-> System.out.println("Lambda crawls"), // более короткая запись анонимного класса
                ()-> System.out.println("Anonymous2 slides")
        };

        for(Moving unit : units) {
            unit.move();
        }

        var movingList = Arrays.asList(units);

             /*   movingList.forEach (new Consumer<Moving>() {
                    @Override
                    public void accept(Moving moving) {
                        moving.move();
                    }
                }); // можно так, а можно ниже
                movingList.forEach(moving -> moving.move());
    */
       // movingList.forEach(Moving::move); // самая короткая запись
        //movingList.forEach(System.out::println);
     var strings = new ArrayList<>(List.of("January", "February", "March", "April", "May") );

//     strings.sort(new Comparator<String>() {
//         @Override
//         public int compare(String o1, String o2) {
//             return o1.length() - o2.length();
//         }
//     });

//strings.sort((s1, s2) ->s2.length() - s1.length() );
//strings.sort((s1, s2)->s1.compareTo(s2));
strings.sort(String::compareTo);// по алфавиту

        var alphabet = new ArrayList<>(List.of("b", "f", "w", "h") );
        alphabet.sort(String::compareTo);
        System.out.println(alphabet);

        Map<Character,Integer> standardAlphabet = Map.of('a', 1, 'b',2);
        alphabet.sort((s1,s2)
    -> standardAlphabet.getOrDefault(s1.charAt(0),0));
//->standardAlphabet.getOrDefault(s2.charAt(0),0)
//


      //  System.out.println(strings);

//        strings.removeIf(new Predicate<String>() {
//    @Override
//    public boolean test(String s) {
//        return s.length()>5; //удаляет строчкиБ длиной более 5
//    }



//})
//
//        strings.removeIf(s -> s.length()>5);
//        System.out.println(strings);
//
//
//        strings.replaceAll(new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return s + "-month";
//            }
//        });
//
        strings.replaceAll( s-> s+ "-month");
        System.out.println(strings);

    }
}
