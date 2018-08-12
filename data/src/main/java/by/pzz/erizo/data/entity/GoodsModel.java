package by.pzz.erizo.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoodsModel {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("sku")
    @Expose
    private String sku;

    @SerializedName("price")
    @Expose
    private String price;

    public GoodsModel() {
    }

    public GoodsModel(String name, String sku, String price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public GoodsModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
