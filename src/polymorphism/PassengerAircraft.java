package polymorphism;

public class PassengerAircraft implements Aerocraft{
    @Override
    public String getAircraftType() {
        return "Passenger Aircraft";
    }

    @Override
    public String performOperation(String operation) {
        return "Passenger Aircraft Performing "+operation+" with passenger protocols";
    }
}
