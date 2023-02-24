package database.cop.bean;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@ToString
@Data
public class Customer {
    private String Username;
    private String FirstName;
    private String LastName;
    private boolean Membership;
    private Date DOB;
    private String PaymentInfo;
    private String Phone;
    private String Address;
    private String Email;
}
