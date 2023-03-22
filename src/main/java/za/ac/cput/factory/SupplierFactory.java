package za.ac.cput.factory;
import za.ac.cput.domain.Supplier;
import za.ac.cput.util.SupplierHelper;
public class SupplierFactory {
    public static Supplier buildSupplier(String name, String address, String email, String phoneNumber){
        if(SupplierHelper.isNullOrEmpty(name) == true || SupplierHelper.isNullOrEmpty(address) == true) {
            return null;
        }

        if(!SupplierHelper.isValidEmail(email)){
            return null;
        }

        if(!SupplierHelper.isValidPhoneNumber(phoneNumber)){
            return null;
        }

        String customerID = SupplierHelper.generateId();

        return new Supplier.Builder().setSupplierID(customerID)
                .setSupplierName(name)
                .setSupplierAddress(address)
                .setSupplierPhone(phoneNumber)
                .setSupplierEmail(email)
                .build();
    }
}
