package org.exoplatform.training.Services;

import org.exoplatform.training.Entity.Products;
import org.exoplatform.training.dto.ProductDTO;

public class MapperProduct {
    public static ProductDTO productToDto(Products entity){
        
        ProductDTO res = new ProductDTO();

        if(entity != null)
        {
            res.setImg(entity.getImg());
            res.setName(entity.getName());
            res.setPrice(entity.getPrice());
            res.setDesc(entity.getDesc());
        }
        return res;
    }
}
