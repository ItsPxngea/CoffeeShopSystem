package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChefHelper {
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator valid = EmailValidator.getInstance();
        return valid.isValid(email);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern phoneNumberPattern = Pattern.compile("^\\d{10}$");
        Matcher findAMatch = phoneNumberPattern.matcher(phoneNumber);
        return (findAMatch.matches());
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
