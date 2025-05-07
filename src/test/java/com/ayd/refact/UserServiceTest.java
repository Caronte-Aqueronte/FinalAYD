package com.ayd.refact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserServiceTest {

    private final UserService userService = new UserService();

    private final String USER_NAME = "luis";
    private final String USER_EMAIL = "email@c";
    private final String USER_PHONE = "4123333";

    private final String ADDRES = "add";
    private final String CITY = "city";
    private final String ZIP = "ZIP";

    private final User USER = new User(USER_NAME, USER_EMAIL, USER_PHONE, ADDRES, CITY, ZIP);

    @Test
    public void testcreateUserSuccess() {

        // arrange
        // ...
        String expected = "User created: " + USER_NAME;
        // ACT
        String result = this.userService.createUser(USER);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserNameEmpty() {

        // arrange
        // ...
        USER.setName(null);
        String expected = "Name cannot be empty";
        // ACT
        String result = this.userService.createUser(USER);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserInvalidEmail() {

        // arrange
        // ...
        USER.setEmail(null);
        String expected = "Invalid email";
        // ACT
        String result = this.userService.createUser(USER);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserInvalidEmailWhitoutA() {

        // arrange
        // ...
        USER.setEmail(null);
        String expected = "Invalid email";
        // ACT
        String result = this.userService.createUser(USER);
        // ASSERT
        assertEquals(expected, result);

    }
}
