package p4;

import p3.Car;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> namesOf = Stream.of("Alex", "Masha", "Misha", "Katya", "Ivan");
        namesOf.filter(name -> name.length()==5).sorted().forEach(System.out::println);

        Stream<SCar> carStream = Stream.of(
                new SCar("Kia Rio", 20_000, "Oleg"),
                new SCar("Mersedes S100", 100_000, "Masha"),
                new SCar("Tesla XXX", 50_000, "Mask Ilon")
        );

        carStream.sorted(new CarComparator()).forEach(System.out::println);


    }
}

class CarComparator implements Comparator<SCar>{

    @Override
    public int compare(SCar scar1, SCar scar2) {
        return scar1.getOwner().toUpperCase().compareTo(scar2.getOwner().toUpperCase());
    }
}
