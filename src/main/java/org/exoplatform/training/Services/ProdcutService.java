package org.exoplatform.training.Services;


import java.util.List;

import org.exoplatform.training.Entity.Products;
import org.exoplatform.training.dao.ProductDAO;

public class ProdcutService  implements ProductInterface{
  private ProductDAO productdao ;

  public ProdcutService(ProductDAO productdao){
    this.productdao=productdao;
  }

  @Override
  public List<Products> getAllProducts() throws Exception {
    return this.productdao.findAll();
  }
  
   
}
