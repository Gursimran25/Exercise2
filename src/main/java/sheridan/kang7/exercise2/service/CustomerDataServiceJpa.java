package sheridan.kang7.exercise2.service;

import sheridan.kang7.exercise2.model.CustomerForm;
import sheridan.kang7.exercise2.repository.CustomerDataRepository;
import sheridan.kang7.exercise2.repository.CustomerEntity;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataServiceJpa implements CustomerDataService {
    private final CustomerDataRepository customerDataRepository;
    CustomerDataServiceJpa(CustomerDataRepository customerDataRepository) {
        this.customerDataRepository = customerDataRepository;
    }

     private static void copyFormToEntity(CustomerForm form, CustomerEntity customer){
        customer.setCustomer_id(form.getCustomer_id());
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setEmail(form.getEmail());
        customer.setCity(form.getCity());
        customer.setStreet(form.getStreet());
        customer.setState(form.getState());
        customer.setZip_Code(form.getZip_Code());
    }
    
    private static void copyEntityToForm(CustomerEntity customer, CustomerForm form){
        form.setCustomer_id(customer.getCustomer_id());
        form.setFirstName(customer.getFirstName());
        form.setLastName(customer.getLastName());
        form.setEmail(customer.getEmail());
        form.setCity(customer.getCity());
        form.setStreet(customer.getStreet());
        form.setState(customer.getState());
        form.setZip_Code(customer.getZip_Code());
    }
    public List<CustomerEntity> getAllCustomers() {
        List<CustomerEntity> entities = new ArrayList<>();
        List<CustomerEntity> customerEntityList = customerDataRepository.findAll();
        for(CustomerEntity customer: customerEntityList) {
            CustomerForm form = new CustomerForm();
            copyEntityToForm(customer, form);
        }
        List<CustomerEntity> formList = null;
        return formList;
    }

    @Override
    public List getAllStudentForms() {
        return null;
    }

    @Override
    public List<CustomerForm> getAllCustomerForms() {
        return null;
    }
}
