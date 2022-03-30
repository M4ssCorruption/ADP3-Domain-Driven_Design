package za.ac.cput.Entity;

public class Flight {
    private String id;
    private String date;
    private String time;

    private Flight(Builder builder){
        this.id= builder.id;
        this.date= builder.date;
        this.time= builder.time;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id= Me'" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String date;
        private String time;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }
        public Builder copy(Flight flight){
            this.id= flight.id;
            this.date= flight.date;
            this.time= flight.time;
            return this;
        }
        public Flight builder(){
            return new Flight(this);
        }
    }
}
