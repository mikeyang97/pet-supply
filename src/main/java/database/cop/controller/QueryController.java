package database.cop.controller;

import database.cop.bean.Customer;
import database.cop.mapper.ProductMapper;
import database.cop.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.standard.OrientationRequested;

@Slf4j
@Controller
public class QueryController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerOrderService customerOrderService;

    @Autowired
    FufillService fufillService;

    @Autowired
    ProductService productService;

    @Autowired
    GeneralService generalService;

    @ResponseBody
    @PostMapping("/getCustomerByUsername")
    public String getByUsername(@RequestParam("username") String username) {
        return customerService.getByUsername(username).toString();
    }

    @ResponseBody
    @PostMapping("/insertCustomer")
    public String insertCustomer(Customer customer){
        return customerService.insertCustomerService(customer).toString();
    }

    @ResponseBody
    @PostMapping("/getByShippingNum")
    public String getByShippingNum(@RequestParam("ShippingNum") int ShippingNum) {
        return customerOrderService.getByShippingNum(ShippingNum).toString();
    }

    @ResponseBody
    @PostMapping("/getByOrderID")
    public String getByOrderID(@RequestParam("OrderID") int OrderID){
        return fufillService.getByOrderID(OrderID).toString();
    }

    @ResponseBody
    @PostMapping("/getByUID")
    public String getByUID(@RequestParam("UID") int UID) {
        return productService.getByUID(UID).toString();
    }

    @ResponseBody
    @PostMapping("/deleteByRating")
    public String deleteByRating(@RequestParam("Rating") double Rating) {
        return productService.deleteByRating(Rating);
    }

    @ResponseBody
    @PostMapping("/getByPurchaseID")
    public String getByPurchaseID(@RequestParam("PurchaseID") int PurchaseID){
        return customerService.getByPurchaseID(PurchaseID).toString();
    }

    @ResponseBody
    @PostMapping("/bestRatingProduct")
    public String bestRatingProduct(@RequestParam("Rating") int Rating){
        return productService.bestRatingProduct(Rating).toString();
    }


    @ResponseBody
    @PostMapping("/count")
    public int count(@RequestParam("arg1") String arg1,
                            @RequestParam("arg2") String arg2,
                            @RequestParam("arg3") String arg3,
                            @RequestParam("arg4") String arg4) {
        return generalService.count(arg1, arg2, arg3, arg4);
    }

    @ResponseBody
    @PostMapping("/selectOne")
    public Object selectOne(@RequestParam("arg1") String arg1,
                            @RequestParam("arg2") String arg2,
                            @RequestParam("arg3") String arg3,
                            @RequestParam("arg4") String arg4,
                            @RequestParam("arg5") String arg5){
        return generalService.selectOne(arg1, arg2, arg3, arg4, arg5).toString();
    }

    @ResponseBody
    @PostMapping("/selectTwo")
    public Object selectTwo(@RequestParam("arg1") String arg1,
                            @RequestParam("arg2") String arg2,
                            @RequestParam("arg3") String arg3,
                            @RequestParam("arg4") String arg4,
                            @RequestParam("arg5") String arg5,
                            @RequestParam("arg6") String arg6){
        return generalService.selectTwo(arg1, arg2, arg3, arg4, arg5, arg6).toString();
    }



}
