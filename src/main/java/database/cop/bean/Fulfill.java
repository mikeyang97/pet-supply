package database.cop.bean;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@ToString
@Data
public class Fulfill {
    private int UID;
    private int OrderID;
    private int ShippingNum;
    private int Qty;
    private Date ShipDate;
    private Date ArriveDate;
}
