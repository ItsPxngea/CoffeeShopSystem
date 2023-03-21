package za.ac.cput.domain;
/*
Hanno Immelman 221074414
 */
import java.util.Objects;

public class Supplier {
    private String supplierID;
    private String supplierName;
    private String supplierAddress;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier() {
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID='" + supplierID + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", supplierPhone='" + supplierPhone + '\'' +
                '}';
    }

    private Supplier(Builder b){

    }

    public static class Builder{
        private String supplierID;
        private String supplierName;
        private String supplierAddress;
        private String supplierEmail;
        private String supplierPhone;

        public Builder setSupplierID(String supplierID){
            this.supplierID = supplierID;
            return this;
        }

        public Builder setSupplierName(String supplierName){
            this.supplierName = supplierName;
            return this;
        }

        public Builder setSupplierAddress(String supplierAddress){
            this.supplierAddress = supplierAddress;
            return this;
        }

        public Builder setSupplierEmail(String supplierEmail){
            this.supplierEmail = supplierEmail;
            return this;
        }

        public Builder setSupplierPhone(String supplierPhone){
            this.supplierPhone = supplierPhone;
            return this;
        }

        public Builder copy(Supplier supplier){
            this.supplierID = supplier.supplierID;
            this.supplierName = supplier.supplierName;
            this.supplierAddress = supplier.supplierAddress;
            this.supplierEmail = supplier.supplierEmail;
            this.supplierPhone = supplier.supplierPhone;
            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }
    }
}
