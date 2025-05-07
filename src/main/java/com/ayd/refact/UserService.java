package com.ayd.refact;

public class UserService {

    public String createUser(User user) {
        // Validation logic mixed with creation
        if (user.getName() == null || user.getName().isEmpty()) {
            return "Name cannot be empty";
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + user.getName();
    }
}
