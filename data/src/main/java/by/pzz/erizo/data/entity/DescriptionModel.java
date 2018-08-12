package by.pzz.erizo.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescriptionModel {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("price")
    @Expose
    private String price;

    @SerializedName("short_description")
    @Expose
    private String shortDescription;

    @SerializedName("images")
    @Expose
    private List<String> images;

    public DescriptionModel() {
    }

    public DescriptionModel(String name, String price, String shortDescription, List<String> images) {
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
        this.images = images;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
