package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class Manager {
    public String staffNumber;
    public String firstName;
    public String lastName;
    public Date dateHired;

    public Manager() {

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

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return staffNumber.equals(manager.staffNumber) && firstName.equals(manager.firstName) && lastName.equals(manager.lastName) && dateHired.equals(manager.dateHired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNumber, firstName, lastName, dateHired);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "staffNumber='" + staffNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateHired=" + dateHired +
                '}';
    }

    public Manager(Builder build) {
        this.staffNumber = build.staffNumber;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.dateHired = build.dateHired;
    }

    public static class Builder {
        public String staffNumber;
        public String firstName;
        public String lastName;
        public Date dateHired;

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

        public Builder setDateHired(Date dateHired) {
            this.dateHired = dateHired;
            return this;
        }

        public Builder copy(Manager manager){
            this.staffNumber = manager.staffNumber;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.dateHired = manager.dateHired;
            return this;
        }
        public Manager build(){
            return new Manager(this);
        }

    }


}
