package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if (oldPassword.equals(password) && isPasswordValid(newPassword)) {
            this.password = newPassword;
        }
    }
    private boolean isPasswordValid(String password) {
        // Password validation criteria
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        // Regular expressions for each condition
        String uppercasePattern = ".*[A-Z].*";
        String lowercasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";
        String specialCharPattern = ".*[^A-Za-z0-9].*";

        return password.length() >= 8
                && password.matches(uppercasePattern)
                && password.matches(lowercasePattern)
                && password.matches(digitPattern)
                && password.matches(specialCharPattern);
    }
}