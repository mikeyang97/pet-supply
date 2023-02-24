package database.cop.bean;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@ToString
@Data
public class CustomerOrder {
    private int OrderID;
    private double TotalPrice;
    private int ShippingNum;
    private Date ShipDate;
    private Date ArriveDate;
    private String Username;
}
