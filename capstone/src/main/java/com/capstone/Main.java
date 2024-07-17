package com.capstone;

public class Main {

    public static boolean CheckPermission(){
        System.out.println("Enter your username: ");
        String username  = InputValidators.validateUsername();
        System.out.println("Enter your password: ");
        String password = InputValidators.validatePassword();

        // Using a hardcoded password for now to test the login functionality
        if(password.equals("password")){
            System.out.println("Welcome " + username + "!");
            return true;
        } else{
            return false;
        }
    }

    public static void DisplayMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1. DISPLAY all clients.");
        System.out.println("2. CHANGE a client's choice.");
        System.out.println("3. EXIT the program.");
        return;
    }

    public static void DisplayClients(){
        System.out.println("Displaying all clients...");
        return;
    }

    public static void ChangeClientChoice(){
        System.out.println("Changing a client's choice...");
        return;
    }

    public static void main(String[] args) {

        int MAX_ATTEMPTS = 3;
        int loginAttempts = 0;
        boolean authenticated = false;
        int choice = 0;

         System.out.println("Welcome to the Capstone Project!");

         while(!authenticated){
            if(loginAttempts < MAX_ATTEMPTS){
                if(CheckPermission()){
                    authenticated = true;
                } else{
                    loginAttempts++;
                    System.out.println("Invalid username or password. Please try again.");
                    System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - loginAttempts));
                }
            } else{
                System.out.println("Too many failed login attempts. Please try again later.");
                return;
            }
         }

         while(choice !=3){
            DisplayMenu();
            choice = InputValidators.validateNumericInput();
            switch(choice){
                case 1:
                    DisplayClients();
                    break;
                case 2:
                    ChangeClientChoice();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
         }
         return;
    }
}