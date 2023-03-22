package za.ac.cput.domain;

import java.util.Objects;

public class Chef {
    public String staffNumber;
    public String firstName;
    public String lastName;

    private Chef() {

    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chef chef = (Chef) o;
        return staffNumber.equals(chef.staffNumber) && firstName.equals(chef.firstName) && lastName.equals(chef.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNumber, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "staffNumber='" + staffNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    private Chef(Builder build){

    }
    public static class Builder{
        private String staffNumber;
        private String firstName;
        private String lastName;
       // private String phoneNumber;


        public Builder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
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
        public Builder copy(Chef chef){
            this.staffNumber = chef.staffNumber;
            this.firstName = chef.firstName;
            this.lastName = chef.lastName;
            return this;
        }
        public Chef build(){
            return new Chef(this);
        }

    }
}
