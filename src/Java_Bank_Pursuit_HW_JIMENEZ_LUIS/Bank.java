package Java_Bank_Pursuit_HW_JIMENEZ_LUIS;

import java.util.*;

public class Bank {
  Scanner scanner = new Scanner(System.in);

  public void welcomeScreen() {

    String login, password;

    System.out.println("\n /$$      /$$  /$$    /$$ /$$$$$$$        /$$$$$$$                      /$$      \n" +
            "| $$$    /$$$ | $$   | $$| $$__  $$      | $$__  $$                    | $$      \n" +
            "| $$$$  /$$$$ | $$   | $$| $$  \\ $$      | $$  \\ $$  /$$$$$$  /$$$$$$$ | $$   /$$\n" +
            "| $$ $$/$$ $$ |  $$ / $$/| $$$$$$$/      | $$$$$$$  |____  $$| $$__  $$| $$  /$$/\n" +
            "| $$  $$$| $$  \\  $$ $$/ | $$____/       | $$__  $$  /$$$$$$$| $$  \\ $$| $$$$$$/ \n" +
            "| $$\\  $ | $$   \\  $$$/  | $$            | $$  \\ $$ /$$__  $$| $$  | $$| $$_  $$ \n" +
            "| $$ \\/  | $$ /$$\\  $//$$| $$ /$$        | $$$$$$$/|  $$$$$$$| $$  | $$| $$ \\  $$\n" +
            "|__/     |__/|__/ \\_/|__/|__/|__/        |_______/  \\_______/|__/  |__/|__/  \\__/");
    System.out.println("\nWelcome to an MVP Bank Teller Program\n");

    System.out.println("\nPlease enter your username to log in: ");
    login = scanner.nextLine();
    System.out.println("\nPlease enter your password: ");
    password = scanner.nextLine();

    BankTeller bankTeller = new BankTeller();

    while (!login.equals(bankTeller.getBankTellerUsername()) && !password.equals(bankTeller.getBankTellerPassword())) {
      System.out.println("\nPlease enter your username to log in: ");
      login = scanner.nextLine();
      System.out.println("\nPlease enter your password: ");
      password = scanner.nextLine();
    }
      if (login.equals(bankTeller.getBankTellerUsername()) && password.equals(bankTeller.getBankTellerPassword())) {
        System.out.println("\nYou are now logged in...Welcome ");
      }
      mainScreen();
  }
  public void mainScreen (){
    System.out.println("\nWhat would you like to do.. ");
    System.out.println("\n1: List Current Customers and their Accounts\n");
    System.out.println("\n2: Add a new account\n");
    System.out.println("\n3: Sign-out\n");

    Customer customer = new Customer();

    String choice = scanner.nextLine();

    switch (choice){
      case "1":
        Customer customer1 = new Customer();
        break;
      case "2":
        customer.addCustomer();
    }

  }
}