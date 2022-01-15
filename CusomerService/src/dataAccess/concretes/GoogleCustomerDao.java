package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class GoogleCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Google ile " + customer.getFirstName() + " kişisi eklendi" + customer.geteMail() + " Adresine mail gönderildi...");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Google ile " + customer.getFirstName() + " güncellendi" + customer.geteMail() + " Adresine mail gönderildi...");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Google ile " + customer.getFirstName() + "silindi" + customer.geteMail() + " Adresine mail gönderildi...");
    }
}
