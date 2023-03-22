package za.ac.cput.factory;
import za.ac.cput.domain.SupplierOrder;
import za.ac.cput.util.SupplierHelper;
import za.ac.cput.util.SupplierOrderHelper;
public class SupplierOrderFactory {
    public static SupplierOrder buildSupplier(String supplierID, String orderDescription, Double orderPrice, String dateMade, String dateDelivered) {

        if (SupplierOrderHelper.isNullOrEmpty(supplierID) == true || SupplierOrderHelper.isNullOrEmpty(orderDescription) == true || SupplierOrderHelper.isInvalidDouble(orderPrice)) {
            return null;
        }

        String dateFormat = "dd-mm-yyyy";
        SupplierOrderHelper.isValidDate(dateMade, dateFormat);
        SupplierOrderHelper.isValidDate(dateDelivered, dateFormat);


        String orderID = SupplierOrderHelper.generateId();

        return new SupplierOrder.Builder().setOrderID(orderID)
                .setSupplierID(supplierID)
                .setOrderDescription(orderDescription)
                .setOrderPrice(orderPrice)
                .setOrderDateMade(dateMade)
                .setOrderDateDelivered(dateDelivered)
                .build();
    }
}
