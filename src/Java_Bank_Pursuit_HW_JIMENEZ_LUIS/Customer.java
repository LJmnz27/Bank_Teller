package Java_Bank_Pursuit_HW_JIMENEZ_LUIS;

import java.util.*;

class Customer {

  private void customerData() {

    /* This is how to declare HashMap */
    HashMap<Integer, String> customerAccounts = new HashMap<>();

    /*Adding elements to HashMap*/
    customerAccounts.put(12345676, "Robert Smith");
    customerAccounts.put(12345677, "Jennifer Sanchez");
    customerAccounts.put(12345678, "Joan Summers");
    customerAccounts.put(12345679, "Peter Pan");
    customerAccounts.put(12345670, "Ivana Jameson");

    /* Display content using Iterator*/
    Set set = customerAccounts.entrySet();
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      Map.Entry mentry = (Map.Entry) iterator.next();
      System.out.print("Account Number : " + mentry.getKey() + " Account Name: ");
      System.out.println(mentry.getValue());
    }

//    /* Get values based on key*/
//    String var= customerAccounts.get(2);
//    System.out.println("Value at index 2 is: "+var);

//    /* Remove values based on key*/
//    customerAccounts.remove(3);
//    System.out.println("Map key and values after removal:");
//

//    Set set2 = customerAccounts.entrySet();
//    Iterator iterator2 = set2.iterator();
//    while(iterator2.hasNext()) {
//      Map.Entry mentry2 = (Map.Entry)iterator2.next();
//      System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
//      System.out.println(mentry2.getValue());
//    }

  }

  public Customer() {
  }

  public  void getCustomerData() {

  }

  public void addCustomer() {
  }

}

