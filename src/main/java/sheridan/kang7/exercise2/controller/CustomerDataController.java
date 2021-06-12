package sheridan.kang7.exercise2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sheridan.kang7.exercise2.model.CustomerForm;
import sheridan.kang7.exercise2.service.CustomerDataService;

import java.util.List;

public class CustomerDataController {
    private final Logger logger = LoggerFactory.getLogger(CustomerDataController.class);


    private final CustomerDataService customerDataService;

    public CustomerDataController(CustomerDataService studentDataService){
        this.customerDataService = studentDataService;
    }


    @GetMapping("/ListCustomers")
    public ModelAndView listCustomers() {
        logger.trace("listCustomers() is called");
        List<CustomerForm> list = customerDataService.getAllCustomerForms();
        return new ModelAndView("ListCustomers",
                "customers", list);
    }

}
