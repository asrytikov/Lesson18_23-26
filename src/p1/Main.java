package p1;

import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        int[] mas = {-5, -10, 2, 0, 10, 20, 30, -66, -90, 100};
        int count = 0;
        for (int i: mas){
            if (i>0) count++;
        }
        System.out.println(count);

        long c = IntStream.of(-5, -10, 2, 0, 10, 20, 30, -66, -90, 100).filter(x -> x>0).count();
        System.out.println(c);



    }
}