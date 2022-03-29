package za.ac.cput.Entity;

public class City {
    private String id;
    private String cityName;
    private String cityAirport;

    private City(Builder builder) {
        this.id = builder.id;
        this.cityName= builder.cityName;
        this.cityAirport=builder.cityAirport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityAirport() {
        return cityAirport;
    }

    public void setCityAirport(String cityAirport) {
        this.cityAirport = cityAirport;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", cityName='" + cityName + '\'' +
                ", cityAirport='" + cityAirport + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String cityName;
        private String cityAirport;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public Builder setCityAirport(String cityAirport){
            this.cityAirport=cityAirport;
            return this;
        }


        public Builder copy(City city){
            this.id=id;
            this.cityName=cityName;
            this.cityAirport=cityAirport;
            return this;
        }
        public City build() {
            return new City(this);
        }
    }


}
