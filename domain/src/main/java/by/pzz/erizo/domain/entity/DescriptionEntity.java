package by.pzz.erizo.domain.entity;

public class DescriptionEntity {

    private String sku;
    private String name;
    private String price;
    private String urlImages;
    private String shortDescription;
    private String description;

    public DescriptionEntity() {
    }

    public DescriptionEntity(String sku, String name, String price, String urlImages, String shortDescription) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.urlImages = urlImages;
        this.shortDescription = shortDescription;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(String urlImages) {
        this.urlImages = urlImages;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
