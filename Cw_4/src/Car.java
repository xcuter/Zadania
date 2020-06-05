public class Car extends Vechicle implements VechicleMethods {
    Car(){
        super();
    }

    Car(
            String RegistrationNumber,
            String VinNumber,
            String Color,
            double Price,
            double FuelConsumption,
            double TankCapacity,
            int FuelType,
            double KilometersDriven,
            double Weight
    ){
            super(RegistrationNumber,VinNumber,Color,Price,FuelConsumption,TankCapacity,FuelType,KilometersDriven,Weight);
            this.MaxWeight = 3500.0;
            this.MaxSpeed = 250.0;
            this.CurrentSpeed = 0.0;
    }


}
