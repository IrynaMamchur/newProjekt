package lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Emp1", "Surname1", new BigDecimal(100L), "driver", 35),
                new Employee("Emp2", "Surname2", new BigDecimal(200L), "scribe", 35),
                new Employee("Emp3", "Surname3", new BigDecimal(50L), "intern", 35),
                new Employee("Emp4", "Surname4", new BigDecimal(500L), "accountare", 35),
                new Employee("Emp5", "Surname5", new BigDecimal(700L), "director", 35),
                new Employee("Emp6", "Surname6", new BigDecimal(300L), "master", 35)

        );
//        List<Employee> sorted = employees.stream()
//                .filter(e ->e.getSalary().compareTo(BigDecimal.valueOf(300L))>0)
//                .sorted((e1, e2) ->e1.getPosition().compareTo(e2.getPosition()))
//                        .toList();
//        System.out.println(sorted); //за счет того, что новая переменная суть в Листе не меняется
//        System.out.println(employees);

//        Integer [] arr ={1,2,3,4,5,6};
//        Arrays.stream(arr);


//        employees.stream();
//        Stream.of(1,23,4,5);

//List<Employee> emp = employees.stream()
//        .takeWhile(e -> e.getAge() <50)
//        .dropWhile(e-> e.getAge()<50)
//        .count();
       // .forEach(e-> System.out.println(e.getName()))
//        .toList();
//
//        System.out.println(emp);
//        private static void simpleExample() {
//            List<String> list = List.of(
//                    "One", "Two", "Three", "Four", "Five", "Six"
//            );
//
//            Function<String, Integer> fun1 = string -> string.length();
//            Function<String, Integer> fun2 = String::length;
//
//
//            List<Integer> integers = new ArrayList<>();
//            for (String s : list) {
//                integers.add(s.length());
//            }
////        List<Integer> integers1 = list.stream()
////                .map(fun2)
////                .toList()
//
//        }



    }
}
