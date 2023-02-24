package database.cop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FufillMapper {

    @Select("SELECT Fulfill.ShipDate FROM (Fulfill natural JOIN SupplierOrders) WHERE SupplierOrders.OrderID = #{OrderID}")
    public String getByOrderID(int OrderID);
}
