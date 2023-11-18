package p5;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{-5, -10, 2, 0, 10, 20, 30, -66, -90, 100});
        IntStream intStream1 = Arrays.stream(new int[]{0,0,0,0,0,0,0,0});
        //intStream.sorted().takeWhile(n -> n<0).forEach(System.out::println);
        //intStream.dropWhile(n -> n<0).forEach(System.out::println);
        IntStream.concat(intStream, intStream1).distinct().forEach(System.out::println);

    }
}
