package org.exoplatform.training.Entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.*;


@ExoEntity
@Entity
@Table(name = "Products")
@NamedQueries({
    @NamedQuery(
      name = "Products.getProduct",
      query = "SELECT p FROM Products  p")   
})
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="img")
    private String img;

    @Column(name="desc")
    private String desc;
    
    @Column(name="price")
    private Float price;

    public Products(){}

    public Products(Long id ,String name , String img  , String desc , Float price ){
        this.id = id ; 
        this.name = name ; 
        this.img = img ;
        this.desc = desc; 
        this.price = price ; 
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public String toString() {
        return  this.name  ; 
     }
    }
