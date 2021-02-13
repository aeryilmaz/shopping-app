package com.aeryilmaz.shoppingapp.product.repository;

import com.aeryilmaz.shoppingapp.product.model.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice,String> {
}
