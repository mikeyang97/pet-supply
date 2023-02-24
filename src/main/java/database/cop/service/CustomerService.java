package database.cop.service;

import ch.qos.logback.core.joran.spi.XMLUtil;
import database.cop.bean.Customer;
import database.cop.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public Customer getByUsername(String username) {
        return customerMapper.getByUsername(username);
    }

    public String insertCustomerService(Customer customer) {
        int i = customerMapper.insertCustomerMapper(customer);
        String res = i + " record(s) inserted";
        return res;
    }

    public String getByPurchaseID(int getByPurchaseID) {
        return customerMapper.getByPurchaseID(getByPurchaseID).toString();
    }
}
