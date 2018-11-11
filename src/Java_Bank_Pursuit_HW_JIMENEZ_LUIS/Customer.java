package Java_Bank_Pursuit_HW_JIMENEZ_LUIS;

import java.util.*;

public class Customer {

  public void customerData() {

    HashMap<Integer, String> customerAccounts = new HashMap<>();

    customerAccounts.put(01, "John Doe");
    customerAccounts.put(02, "John Doe");
    customerAccounts.put(03, "John Doe");
    customerAccounts.put(04, "John Doe");
    customerAccounts.put(05, "John Doe");

    String firstCustomer = customerAccounts.get(01);
    String secondCustomer = customerAccounts.get(02);
    String thirdCustomer = customerAccounts.get(03);
    String fourthCustomer = customerAccounts.get(04);
    String fifthCustomer = customerAccounts.get(05);


    ArrayList<String> customers = new ArrayList<>();

    customers.add("\nJohn Doe1\n");
    customers.add("John Doe2\n");
    customers.add("John Doe3\n");
    customers.add("John Doe4\n");
    customers.add("John Doe5\n");

    System.out.println(customers);

  }

  public void addCustomer() {
  }

}

