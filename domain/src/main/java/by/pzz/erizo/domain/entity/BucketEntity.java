package by.pzz.erizo.domain.entity;

/**
 * Created by Erizo on 13.04.2018.
 */

public class BucketEntity {

    private String text;
    private String sku;
    private String price;

    public BucketEntity() {
    }

    public BucketEntity(String text, String sku, String price) {
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
