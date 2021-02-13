package com.aeryilmaz.shoppingapp.product.service;

import com.aeryilmaz.shoppingapp.product.dto.ProductResponse;
import com.aeryilmaz.shoppingapp.product.dto.ProductSaveRequest;

import java.util.List;

public interface IProductService {

    public List<ProductResponse> getByPaging();
    public ProductResponse save(ProductSaveRequest productSaveRequest);

}
