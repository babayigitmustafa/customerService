package business.concrete;

import business.abstracts.CustomerService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;
    private LoggerService logger;

    public CustomerManager(CustomerDao customerDao, LoggerService logger) {
        this.customerDao = customerDao;
        this.logger = logger;
    }

    Pattern passwordPattern = Pattern.compile("[a-z,A-Z,0-9]{6,}");
    Pattern eMailPattern = Pattern.compile("^(.+)@(.+)$");
    Pattern namePattern = Pattern.compile("[a-z]{2,}");

    @Override
    public void add(Customer customer) {
        Matcher passwordMatcher, mailMatcher, firstNameMatcher, lastNameMatcher;
        passwordMatcher = passwordPattern.matcher(customer.getPassword());
        mailMatcher = eMailPattern.matcher(customer.geteMail());
        firstNameMatcher = namePattern.matcher(customer.getFirstName());
        lastNameMatcher = namePattern.matcher(customer.getLastName());
        List<Matcher> arrayList = new ArrayList();
        arrayList.add(mailMatcher);
        arrayList.add(passwordMatcher);
        arrayList.add(firstNameMatcher);
        arrayList.add(lastNameMatcher);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).find()) {

            } else {
                System.out.println("Giris bilgilerini kontrol edin  :" + customer.getFirstName());
                return;
            }

        }
        this.customerDao.add(customer);
        this.logger.log();

    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " İsimli müşteri güncellendi");
    }

    @Override
    public void delete(Customer customer) {

        System.out.println(customer.getFirstName() + " İsimli müşteri silindi");

    }
}
