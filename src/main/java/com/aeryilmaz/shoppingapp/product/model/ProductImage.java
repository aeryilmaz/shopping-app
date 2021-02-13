package com.aeryilmaz.shoppingapp.product.model;

public class ProductImage {


    private ImageType imageType;
    private String url;

    enum ImageType{
        FEATURE, NORMAL
    }

}
