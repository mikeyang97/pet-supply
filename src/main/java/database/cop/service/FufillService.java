package database.cop.service;

import database.cop.mapper.FufillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FufillService {

    @Autowired
    FufillMapper fufillMapper;

    public String getByOrderID(int OrderID){
        return fufillMapper.getByOrderID(OrderID).toString();
    }
}
