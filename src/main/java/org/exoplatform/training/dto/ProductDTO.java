package org.exoplatform.training.dto;

import org.json.JSONException;
import org.json.JSONObject;

public class ProductDTO
{
    
    private String name;
    private Float price;
    private String img;
    private String desc;


    public ProductDTO(){}

    public ProductDTO(String name , Float price ,  String img)
    {
        this.name = name ; 
        this.price = price ; 
        this.img = img ; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
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
    public JSONObject toJSONObject (){

        JSONObject jsonObject = new JSONObject();
              try {
                jsonObject.put("name", name);
                jsonObject.put("img", img);
                jsonObject.put("desc", desc);
                jsonObject.put("price", price);
            } catch (JSONException e) {
                e.printStackTrace();
            }
      return jsonObject;
  }

}
