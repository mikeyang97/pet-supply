package database.cop.service;

import database.cop.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    public String getByUID(int UID) {
        return productMapper.getByUID(UID).toString();
    }

    public String deleteByRating(double Rating){
        int i = productMapper.deleteByRating(Rating);
        return i + " record(s) deleted";
    }

    public String bestRatingProduct(double Rating){
        return productMapper.bestRatingProduct(Rating);
    }
}
