package com.aeryilmaz.shoppingapp.product.repository.elasticsearch;

import com.aeryilmaz.shoppingapp.product.model.elasticsearch.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs,String> {


}
