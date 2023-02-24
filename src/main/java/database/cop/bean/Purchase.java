package database.cop.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Purchase {
    private int UID;
    private String Username;
    private int PurchaseID;
    private int Qty;
    private int OrderID;
}
