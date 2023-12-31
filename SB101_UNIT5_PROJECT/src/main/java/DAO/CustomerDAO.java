package DAO;

import java.util.List;

import ENTITY.Customer;
import EXCEPTION.NoRecordFoundException;
import EXCEPTION.SomeThingWentWrongException;

public interface CustomerDAO {

	void addCustomer(Customer customer) throws SomeThingWentWrongException;

	List<Object[]> getCustomerList() throws SomeThingWentWrongException, NoRecordFoundException;

	void login(String username, String password) throws SomeThingWentWrongException;

	void ViewPurchasedCars() throws SomeThingWentWrongException, NoRecordFoundException;

	void changePassword(String oldPassword, String newPassword) throws SomeThingWentWrongException;

	void deleteAccount() throws SomeThingWentWrongException;

}
