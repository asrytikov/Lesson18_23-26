package p4;

import p3.Car;

public class SCar extends Car {

    private String owner;

    public SCar(String model, int price, String owner) {
        super(model, price);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SCar{" + super.toString() +
                " owner='" + owner + '\'' +
                '}';
    }
}
