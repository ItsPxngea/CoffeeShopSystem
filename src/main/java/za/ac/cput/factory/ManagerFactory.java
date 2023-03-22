package za.ac.cput.factory;

import za.ac.cput.domain.Manager;
import za.ac.cput.util.ManagerHelper;

import java.util.Date;

public class ManagerFactory {
    public static Manager buildChef(String firstName, String lastName, String phoneNumber, String email, Date dateHired) {
        if (ManagerHelper.isNullOrEmpty(firstName) == true || ManagerHelper.isValidEmail(lastName) == true) {
            return null;
        }

        if (!ManagerHelper.isValidEmail(email)) {
            return null;
        }

        if (!ManagerHelper.isValidPhoneNumber(phoneNumber)) {
            return null;
        }



        String staffNumber = ManagerHelper.generateId();

        return new Manager.Builder()
                .build();

    }
}
