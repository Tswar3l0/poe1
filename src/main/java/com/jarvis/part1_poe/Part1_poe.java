/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jarvis.part1_poe;

import java.util.Scanner;

/**
 *
 * @author HP ProBook
 */
public class Part1_poe {

    public static void main(String[] args) {

        //constructor
        Login login = new Login();

        Scanner scan = new Scanner(System.in);

        String first_name = "";
        String last_name = "";

        String temp_username = "";
        String temp_password = "";
        String temp_phonenumber = "";

        do {
            //Firstname
            System.out.print("Enter your first name: ");
            first_name = scan.nextLine();
        } while (first_name.isEmpty());
        login.setFirstname(first_name);

        do {
            //Lastname
            System.out.print("Enter your second name: ");
            last_name = scan.nextLine();
        } while (last_name.isEmpty());
        login.setLastname(scan.nextLine());

        boolean registered = true;

        while (registered) {

            do {
                //username
                System.out.print("Enter your username: ");
                login.setUsername(scan.nextLine());
            } while (login.checkUserName(login.getUsername()) == false);
            temp_username = login.getUsername();//Storing the information in a temp variable if they meet the required conditions(username)

            do {
                //password
                System.out.print("Enter password: ");
                login.setPassword(scan.nextLine());
            } while (login.checkPasswordComplexity(login.getPassword()) == false);
            temp_password = login.getPassword();//Storing the information in a temp variable if they meet the required conditions(password)

            do {
                //phone number
                System.out.print("Enter cell phone number: ");
                login.setPhone_number(scan.nextLine());
            } while (login.checkCellPhoneNumber(login.getPhone_number()) == false);
            temp_phonenumber = login.getPhone_number();//Storing the information in a temp variable if they meet the required conditions(call phone number)

            registered = false;
        }

        boolean logging_in = true;
        while (logging_in) {
            System.out.println("********Login*******");

            System.out.print("Enter username: ");
            login.setLogin_username(scan.nextLine());

            System.out.print("Enter password: ");
            login.setLogin_password(scan.nextLine());

            System.out.println("********************");

            if (login.loginUser(temp_username, temp_password, temp_phonenumber, login.getLogin_username(), login.getLogin_password())) {
                System.out.print(login.returnLoginStatus(temp_username, temp_password, temp_phonenumber, login.getLogin_username(), login.getLogin_password(), login.getFirstname(), login.getLastname()));
                logging_in = false;
            } else {
                System.out.print(login.returnLoginStatus(temp_username, temp_password, temp_phonenumber, login.getLogin_username(), login.getLogin_password(), login.getFirstname(), login.getLastname()));
            }
        }

        scan.close();
    }
}
