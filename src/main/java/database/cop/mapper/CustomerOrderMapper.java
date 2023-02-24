package database.cop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerOrderMapper {

    @Select("SELECT Username, Address, Phone FROM Customers c natural join CustomerOrders co WHERE co.ShippingNum = #{ShippingNum}")
    public String getByShippingNum(int ShippingNum);
}
