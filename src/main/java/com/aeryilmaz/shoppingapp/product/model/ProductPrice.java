package com.aeryilmaz.shoppingapp.product.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collation = "product_price")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductPrice {
    private String id;
    private String productId;
    private String currency;
    private BigDecimal price;

}
