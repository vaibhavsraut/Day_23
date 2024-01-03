import com.day22.InvalidUserDetailsException;
import com.day22.UserRegistration;

public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            userRegistration.validateFirstName("Vaibhav");
            userRegistration.validateLastName("Raut");
            userRegistration.validateEmail("vaibhav.raut851@gmail.com");
            userRegistration.validateMobile("91 9919819801");
            userRegistration.validatePassword("Pass@word1");
            System.out.println("Valid Test Cases Passed!");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Valid Test Cases Failed: " + e.getMessage());
        }

        try {
            userRegistration.validateFirstName("Vaibhav");
            userRegistration.validateLastName("Raut");
            userRegistration.validateEmail("vaibhav-com");
            userRegistration.validateMobile("1234567890");
            userRegistration.validatePassword("simplepass");
            System.out.println("Invalid Test Cases Passed!");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Invalid Test Cases Failed: " + e.getMessage());
        }
    }
}
