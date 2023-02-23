package vehicles;

public class Car extends Vehicle {
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    // вариант 1:
    //  public Car(double fuelQuantity, double fuelConsumption) {
    //        super(fuelQuantity, fuelConsumption + 0.9);
    //    }

    // вариант 2:
    //  public Car(double fuelQuantity, double fuelConsumption) {
    //        super(fuelQuantity, fuelConsumption);
    //        setFuelConsumption(getFuelConsumption() + 0.9);
    //    }

    // вариант 3: (ако Vehicle е интерфейс и има VehicleImpl абстрактен клас за връзка
    // с Car  и Truck)
    // в конструктора на VehicleImpl сетваме :
    // setFuelConsumption(fuelConsumption);
    // override метода в Car:
    //     @Override
    //    public void setFuelConsumption(double fuelConsumption) {
    //        super.setFuelConsumption(fuelConsumption + 0.9);
    //    }

    // в случая 0.9 е така нареченото магическо число - трябва да се обяснява какво точно репрезентира.
    // Затова е по-добре да се създаде константа public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;
}
