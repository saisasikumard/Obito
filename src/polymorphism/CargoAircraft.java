package polymorphism;

public class CargoAircraft implements Aerocraft{
    @Override
    public String getAircraftType() {
        return "Cargo Aircraft";
    }

    @Override
    public String performOperation(String operation) {
        return "Cargo Aircraft performing "+ operation+" with passenger safety protocols";
    }
}
