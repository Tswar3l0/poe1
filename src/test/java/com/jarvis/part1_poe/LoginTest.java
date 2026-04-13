/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jarvis.part1_poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP ProBook
 */
public class LoginTest {
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Login login = new Login();
        String username = "kyle!!!!!!";
        boolean expResult = false;
        boolean result = login.checkUserName(username);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        Login login = new Login();
        String password = "password";
        boolean expResult = false;
        boolean result = login.checkPasswordComplexity(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        Login login = new Login();
        String phone_number = "08966553";
        boolean expResult = false;
        boolean result = login.checkCellPhoneNumber(phone_number);
        assertEquals(expResult, result);

    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUserfalse() {
        System.out.println("registerUser");

        boolean is_username_valid = false;
        boolean is_password_valid = false;
        Login login = new Login();
        login.setUsername("kyle!!!!!!");
        login.setPassword("password");
        String expResult = "Username and password do not meet the requirements.\n";
        String result = login.registerUser(is_username_valid, is_password_valid);
        assertEquals(expResult, result);

    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUserfalse() {
        System.out.println("loginUser");
        Login login = new Login();
        String temp_username = "kyl_1";
        String temp_password = "Ch&&sec@ke99!";
        String temp_phonenumber = "+27838968976";
        String login_username = "kyle!!!!!!";
        String login_password = "password";
        boolean expResult = false;
        boolean result = login.loginUser(temp_username, temp_password, temp_phonenumber, login_username, login_password);
        assertEquals(expResult, result);

    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Login login = new Login();
        String temp_username = "kyl_1";
        String temp_password = "Ch&&sec@ke99!";
        String temp_phonenumber = "+27838968976";
        String login_username = "kyle!!!!!!";
        String login_password = "password";
        String Firstname = "Tswarelo";
        String Lastname = "Mlangeni";
        String expResult = "Username or password incorrect please try again.\n";
        String result = login.returnLoginStatus(temp_username, temp_password, temp_phonenumber, login_username, login_password, Firstname, Lastname);
        assertEquals(expResult, result);
    }
    
    
}
