import java.util.ArrayList;

public class RentableCar extends Car implements Rentable {
    private Person person = new Person(null, null, null);

    public RentableCar(String name, int productionYear, int seatsNumber) {
        super(name, productionYear, seatsNumber);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setId(id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        if (!(person == null)) {
            return true;
        } else
            return false;
    }

    @Override
    public void addToArray(Vehicle[] vehicle, Vehicle vehicle1) {
        super.addToArray(vehicle, vehicle1);
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "person=" + person +
                '}' + super.toString();
    }
}
