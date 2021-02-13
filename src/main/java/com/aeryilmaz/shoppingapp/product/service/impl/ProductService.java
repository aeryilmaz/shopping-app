package com.aeryilmaz.shoppingapp.product.service.impl;

import com.aeryilmaz.shoppingapp.product.dto.ProductResponse;
import com.aeryilmaz.shoppingapp.product.dto.ProductSaveRequest;
import com.aeryilmaz.shoppingapp.product.repository.ProductRepository;
import com.aeryilmaz.shoppingapp.product.repository.elasticsearch.ProductEsRepository;
import com.aeryilmaz.shoppingapp.product.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private ProductEsRepository productEsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponse> getByPaging(){
        // 1 - Elasticsearch üzerinden sorgula
        // 2 - product nesnesindeki diğer alanları işle
        // 3 - response nesnesine map'le

        return null;
    }

    @Override
    public ProductResponse save(ProductSaveRequest productSaveRequest){
                //mongoya yaz
                //es üzerinden güncelleme yapılacak
                //redis üzerinden güncelleme yapılacak
                //es üzerinden cevap dön
                //es üzerinden gelen nesneyi response nesnesine map'le
        return null;

    }
}
