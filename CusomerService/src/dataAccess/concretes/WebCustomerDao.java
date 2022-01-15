package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class WebCustomerDao implements CustomerDao {

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + " kişisi Web ile eklendi " + customer.geteMail() + " Adresine mail gönderildi...");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " kişisi Web ile güncellendi " + customer.geteMail() + " Adresine mail gönderildi...");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " kişisi Web ile silindi " + customer.geteMail() + " Adresine mail gönderildi...");
    }
}
