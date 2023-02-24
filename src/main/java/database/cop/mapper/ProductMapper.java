package database.cop.mapper;

import database.cop.bean.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {

    @Select("select Name, StockQty, (Price * Discount - Cost) as Profit, Rating from Products where UID = #{UID}")
    public String getByUID(int UID);

    @Delete("delete from Products where Rating < #{Rating}")
    public int deleteByRating(double Rating);

    @Select("SELECT P.name FROM Products P WHERE P.rating = #{Rating}")
    public String bestRatingProduct(double Rating);
}
