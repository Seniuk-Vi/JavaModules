package main.enterprise;

import main.api.Accountant;
import main.labor.market.AccountantLMImpl;
import main.university.AccountantImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello enterprise");
        Accountant accountant1 = new AccountantImpl();
        Accountant accountant2 = new AccountantLMImpl();
        accountant1.doJob();
        accountant2.doJob();
    }
}
