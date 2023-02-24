package database.cop.service;

import database.cop.mapper.CustomerOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderService {

    @Autowired
    CustomerOrderMapper customerOrderMapper;

    public String getByShippingNum(int ShippingNum){
        return customerOrderMapper.getByShippingNum(ShippingNum).toString();
    }
}
