import business.abstracts.CustomerService;
import business.concrete.CustomerManager;
import core.concretes.SmsLogger;
import dataAccess.concretes.YahooCustomerDao;
import entities.concretes.Customer;

public class Main {
    public static void main(String[] args) {
        Customer mustafa = new Customer("Mustafa", "Babayigit", "deneme@gmail.com", "1234asd");
        CustomerService customerService = new CustomerManager(new YahooCustomerDao(), new SmsLogger());
        customerService.add(mustafa);
    }
}
