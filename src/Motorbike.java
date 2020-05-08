public class Motorbike extends Vehicle {

    private String direction;
    private int speedLimit;

    public Motorbike(String name, int productionYear, int speedLimit) {
        super(name, productionYear);
        this.speedLimit = speedLimit;
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
        return "Motorbike{" +
                "speedLimit=" + speedLimit +
                '}' + super.toString();
    }
}
