public abstract class Vechicle {
    protected String RegistrationNumber;
    protected String VinNumber;
    protected String Color;
    protected double Price;
    protected double FuelConsumption;
    protected double TankCapacity;
    protected String [] FuelTypes={"Petrol","Diesel","Electric"};
    protected String FuelType;
    protected double KilometersDriven;
    protected double Weight;
    protected double MaxWeight;
    protected double CurrentSpeed;
    protected double MaxSpeed;

    void SetKilometersDriven(double Kilometers){
        this.KilometersDriven += Kilometers;
    }

    Vechicle(){
        this.RegistrationNumber = "DefaultRegNumber";
        this.VinNumber = "DefaultVIN";
        this.Color = "Neuter";
        this.Price = 1000000.0;
        this.FuelConsumption = 0.0;
        this.TankCapacity = 20;
        this.FuelType=FuelTypes[0];
        this.KilometersDriven = 0;
        this.Weight = 10000.0;
        this.MaxWeight = 30000.0;
    }

    Vechicle(
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
        this.RegistrationNumber = RegistrationNumber;
        this.VinNumber = VinNumber;
        this.Color = Color;
        this.Price = Price;
        this.FuelConsumption = FuelConsumption;
        this.TankCapacity = TankCapacity;
        this.FuelType = this.FuelTypes[FuelType];
        this.KilometersDriven = KilometersDriven;
        this.CurrentSpeed = 0;
        if(Weight < MaxWeight){
            this.Weight = Weight;
        }else {
            this.Weight = -100.0;
        }
    };

    boolean AddSpeed(double Speed){
        if(Speed+this.CurrentSpeed < MaxSpeed){
            this.CurrentSpeed+=Speed;
            return true;
        }else {
            return false;
        }
    }

    double GetSpeed(){
        return this.CurrentSpeed;
    }

    boolean BreakToSpeed(double ToSpeed){
        if (this.CurrentSpeed-ToSpeed >=0){
            this.CurrentSpeed-=ToSpeed;
            return true;
        }else {
            return false;
        }
    }
}
