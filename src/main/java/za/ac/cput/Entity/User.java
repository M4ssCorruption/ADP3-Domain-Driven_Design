package za.ac.cput.Entity;

public class User {
    private String flightId;
    private String email;
    private String firstName;
    private String lastName;
    private String userIdNumber;

    private  User(Builder builder){
        this.flightId=builder.flightId;
        this.email=builder.email;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.userIdNumber=builder.userIdNumber;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "flightId='" + flightId + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userIdNumber='" + userIdNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String flightId;
        private String email;
        private String firstName;
        private String lastName;
        private String userIdNumber;



        public Builder setFlightId(String flightId) {
            this.flightId = flightId;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setUserIdNumber(String userIdNumber) {
            this.userIdNumber = userIdNumber;
            return this;
        }
        public Builder copy(User user){
            this.flightId=user.flightId;
            this.email=user.email;
            this.firstName=user.firstName;
            this.lastName=user.lastName;
            this.userIdNumber=user.userIdNumber;
            return this;
        }
        public User builder(){
            return new User(this);
        }
    }

}
