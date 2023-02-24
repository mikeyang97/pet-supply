package database.cop.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class SupplierOrder {
    private int OrderID;
    private String Name;
    private String Addr;
    private String Phone;
    private String Email;
}
