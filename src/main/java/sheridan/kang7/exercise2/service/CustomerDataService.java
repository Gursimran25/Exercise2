package sheridan.kang7.exercise2.service;

import sheridan.kang7.exercise2.model.CustomerForm;

import java.util.List;

public interface CustomerDataService<CustomerForm> {
    List<CustomerForm> getAllStudentForms();

    List<sheridan.kang7.exercise2.model.CustomerForm> getAllCustomerForms();
}
