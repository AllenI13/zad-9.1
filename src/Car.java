public class Car extends Vehicle {
    private String direction;
    private int seatsNumber;

    public Car(String name, int productionYear, int seatsNumber) {
        super(name, productionYear);
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void addToArray(Vehicle[] vehicle, Vehicle vehicle1) {
        super.addToArray(vehicle, vehicle1);
    }

    @Override
    public String turnLeft() {
        return direction = "left";
    }

    @Override
    public String turnRight() {
        return direction = "right";
    }

    @Override
    public String goForward() {
        return direction = "straight";
    }

    @Override
    public String goBackward() {
        return direction = "backwards";
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "direction='" + direction + '\'' +
                ", seatsNumber=" + seatsNumber +
                '}' + super.toString();
    }
}
