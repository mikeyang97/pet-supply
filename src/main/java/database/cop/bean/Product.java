package database.cop.bean;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@ToString
@Data
public class Product {
    private int UID;
    private String Name;
    private double Cost;
    private String ProductionDate;
    private Date ExprDate;
    private String Category;
    private int StockQty;
    private String Description;
    private double Price;
    private double Discount;
    private double Rating;
}
