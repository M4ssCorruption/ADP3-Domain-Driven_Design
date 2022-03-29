package za.ac.cput.Entity;

public class Airport {
    private String flightCode;
    private String airportName;

    private Airport(Builder builder) {
        this.flightCode = builder.flightCode;
        this.airportName= builder.airportName;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "flightCode='" + flightCode + '\'' +
                ", airportName='" + airportName + '\'' +
                '}';
    }
    public static class Builder{
        private String flightCode;
        private String airportName;


        public Builder setFlightCode(String flightCode) {
            this.flightCode = flightCode;
            return this;
        }

        public Builder setAirportName(String firstName) {
            this.airportName = airportName;
            return this;
        }



        public Builder copy(Airport airport){
            this.flightCode=flightCode;
            this.airportName=airportName;
            return this;
        }
        public Airport build() {
            return new Airport(this);
        }
    }
}
