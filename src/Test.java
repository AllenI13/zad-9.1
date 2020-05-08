public class Test {
    public static void main(String[] args) {
        Car array[] = new Car[2];
        RentableCar car = new RentableCar("Audi", 1222, 4);
        RentableCar car1 = new RentableCar("Volvo", 2010, 2);
        car.addToArray(array, car);
        car.addToArray(array, car1);
        car.rent("Igor", "Trochimiuk", "555");
        car1.rent("Zuzanna", "Kowalska", "666");
        System.out.println(car.isRent());
        System.out.println(car1.isRent());
        car.turnLeft();
        car.turnLeft();
        System.out.println(car.getDirection());
        car1.goBackward();
        System.out.println(car1.getDirection());
        System.out.println(car.toString());
        System.out.println(car1.toString());
        car.handOver();
        car1.handOver();
        System.out.println(car.isRent());
    }
}
