package com.codeclan.project.Project3.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "searchitems")
public class SearchItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "image")
    private String image;

    @Column(name = "rating")
    private int rating;

    @Column(name = "high_price")
    private double highPrice;

    @Column(name = "low_price")
    private double lowPrice;

    @Column(name = "saving")
    private double saving;

    @JsonIgnore
    @OneToMany(mappedBy = "searchitem")
    private ArrayList<Country> countries;

    public SearchItem(){
    }

    public SearchItem(String productName, String image, int rating, double highPrice, double lowPrice, double saving) {
        this.productName = productName;
        this.image = image;
        this.rating = rating;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.saving = saving;
        this.countries = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }
}
