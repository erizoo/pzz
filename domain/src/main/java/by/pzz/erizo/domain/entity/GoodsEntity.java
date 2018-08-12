package by.pzz.erizo.domain.entity;

public class GoodsEntity {

    private String text;
    private String sku;
    private String price;

    public GoodsEntity() {
    }

    public GoodsEntity(String text, String sku, String price) {
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

    public GoodsEntity(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
