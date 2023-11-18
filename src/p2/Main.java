package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Alex", "Masha", "Misha", "Katya", "Ivan");
        names.stream()
                .filter(s -> s.length()==5)
                .forEach(s-> System.out.println(s));

        Stream<String> namesStream = names.stream();
        namesStream = namesStream.filter(s -> s.length()==5);
        namesStream.forEach(s-> System.out.println(s));

        System.out.println("--------------------");
        Stream<String> namesArr = Arrays.stream(new String[]{"Alex", "Masha", "Misha", "Katya", "Ivan"});
        namesArr.forEach(System.out::println);
        System.out.println("--------------------");
        IntStream intStream = Arrays.stream(new int[]{-5, -10, 2, 0, 10, 20, 30, -66, -90, 100});
        intStream.forEach(System.out::println);
        System.out.println("--------------------");
        Stream<String> namesOf = Stream.of("Alex", "Masha", "Misha", "Katya", "Ivan");
        namesOf.forEach(System.out::println);
        System.out.println("--------------------");
        String[] namesArray = {"Alex", "Masha", "Misha", "Katya", "Ivan"};
        Stream<String> namesArrStream = Stream.of(namesArray);



    }
}
