package com.day22;

import java.util.regex.Pattern;

public class UserRegistration {
    public void validate(String data, Validator validator, String errorMessage) throws InvalidUserDetailsException {
        if (!validator.validate(data)) {
            throw new InvalidUserDetailsException(errorMessage);
        }
    }

    public void validateFirstName(String firstName) throws InvalidUserDetailsException {
        validate(firstName, data -> Pattern.matches("[A-Z][a-zA-Z]{2,}", data), "Invalid First Name");
    }

    public void validateLastName(String lastName) throws InvalidUserDetailsException {
        validate(lastName, data -> Pattern.matches("[A-Z][a-zA-Z]{2,}", data), "Invalid Last Name");
    }

    public void validateEmail(String email) throws InvalidUserDetailsException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        validate(email, data -> Pattern.matches(emailRegex, data), "Invalid Email");
    }

    public void validateMobile(String mobile) throws InvalidUserDetailsException {
        validate(mobile, data -> Pattern.matches("^(\\d{2} \\d{10})$", data), "Invalid Mobile Number");
    }

    public void validatePassword(String password) throws InvalidUserDetailsException {
        validate(password, data -> Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$", data), "Invalid Password");
    }
}
