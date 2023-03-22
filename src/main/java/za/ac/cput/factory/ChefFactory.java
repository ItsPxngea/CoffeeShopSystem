package za.ac.cput.factory;

import za.ac.cput.domain.Chef;
import za.ac.cput.util.ChefHelper;

public class ChefFactory {
    public static Chef buildChef(String firstName, String lastName, String phoneNumber, String email) {
        if (ChefHelper.isNullOrEmpty(firstName) == true || ChefHelper.isValidEmail(lastName) == true) {
            return null;
        }

        if (!ChefHelper.isValidEmail(email)) {
            return null;
        }

        if (!ChefHelper.isValidPhoneNumber(phoneNumber)) {
            return null;
        }

        String staffNumber = ChefHelper.generateId();

        return new Chef.Builder().setStaffNumber(staffNumber)
                .setFirstName(firstName)
                .setFirstName(lastName)
                .build();

    }

}
