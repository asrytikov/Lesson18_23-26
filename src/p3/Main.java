package p3;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Car> carStream = Stream.of(
                new Car("Kia Rio", 20_000),
                new Car("Mersedes S100", 100_000),
                new Car("Tesla XXX", 50_000)
        );

        //carStream.filter(car -> car.getPrice()>30_000).forEach(car -> System.out.println(car.getModel()));

        //carStream.map(car -> car.getModel()).forEach(System.out::println);

        //carStream.map(car -> "Model: " + car.getModel() + " Price: " + car.getPrice()).forEach(System.out::println);

        //carStream.mapToInt(car -> car.getPrice()).forEach(System.out::println);

        carStream.flatMap(car -> Stream.of(
                String.format("Model: %s price without discont: %d", car.getModel(), car.getPrice()),
                String.format("Model: %s price with discont: %d", car.getModel(), car.getPrice()-(int)(car.getPrice()*0.05))
        )).forEach(System.out::println);



    }
}
