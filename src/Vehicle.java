public abstract class Vehicle implements Moveable {
    private String name;
    private int productionYear;

    public Vehicle(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public void addToArray(Vehicle[] vehicle, Vehicle vehicle1) {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] == null) {
                vehicle[i] = vehicle1;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
