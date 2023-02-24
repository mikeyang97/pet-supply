package database.cop.mapper;

import database.cop.bean.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper {

    @Select("select * from Customers where Username = #{username}")
    public Customer getByUsername(String username);

    @Insert("insert into Customers(`Username`, `FirstName`, `LastName`, `Membership`, `DOB`, `PaymentInfo`, `Phone`, `Address`, `Email`) values(#{Username}, #{FirstName}, #{LastName}, #{Membership}, #{DOB}, #{PaymentInfo}, #{Phone}, #{Address}, #{Email})")
    public int insertCustomerMapper(Customer customer);

    @Select(" SELECT Customers.FirstName, Customers.LastName FROM Customers NATURAL JOIN Purchase WHERE PurchaseID = #{PurchaseID}")
    public String getByPurchaseID(int PurchaseID);

}