package za.ac.cput.domain;
/*
Hanno Immelman 221074414
 */
public class SupplierOrder {
    private String orderID;
    private String supplierID;
    private String orderDescription;
    private float orderPrice;
    private String dateMade;
    private String dateDelivered;

    public SupplierOrder() {
    }

    public String getOrderID() {
        return orderID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public String getDateMade() {
        return dateMade;
    }

    public String getDateDelivered() {
        return dateDelivered;
    }

    @Override
    public String toString() {
        return "SupplierOrder{" +
                "orderID='" + orderID + '\'' +
                ", supplierID='" + supplierID + '\'' +
                ", orderDescription='" + orderDescription + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", dateMade='" + dateMade + '\'' +
                ", dateDelivered='" + dateDelivered + '\'' +
                '}';
    }

    private SupplierOrder(Builder b){

    }

    public static class Builder{
        private String orderID;
        private String supplierID;
        private String orderDescription;
        private float orderPrice;
        private String dateMade;
        private String dateDelivered;

        public Builder setOrderID(String orderID){
            this.orderID = orderID;
            return this;
        }

        public Builder setSupplierID(String supplierID){
            this.supplierID = supplierID;
            return this;
        }

        public Builder setOrderDescription(String orderDescription){
            this.orderDescription = orderDescription;
            return this;
        }

        public Builder setOrderPrice(float orderPrice){
            this.orderPrice = orderPrice;
            return this;
        }

        public Builder setOrderDateMade(String dateMade){
            this.dateMade= dateMade;
            return this;
        }

        public Builder setOrderDateDelivered(String dateDelivered){
            this.dateDelivered= dateDelivered;
            return this;
        }

        public Builder copy(SupplierOrder order){
            this.orderID = order.orderID;
            this.supplierID = order.supplierID;
            this.orderDescription = order.orderDescription;
            this.orderPrice = order.orderPrice;
            this.dateMade = order.dateMade;
            this.dateDelivered = order.dateDelivered;
            return this;
        }

        public SupplierOrder build(){
            return new SupplierOrder(this);
        }
    }
}
