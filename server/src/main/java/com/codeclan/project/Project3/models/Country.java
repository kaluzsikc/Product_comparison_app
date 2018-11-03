package com.codeclan.project.Project3.models;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "price")
    private double price;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "search_item_id", nullable = false)
    private SearchItem searchItem;

    public Country() {
    }

    public Country(String abbreviation, double price, String url, SearchItem searchItem) {
        this.abbreviation = abbreviation;
        this.price = price;
        this.url = url;
        this.searchItem = searchItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SearchItem getSearchItem() {
        return searchItem;
    }

    public void setSearchItem(SearchItem searchItem) {
        this.searchItem = searchItem;
    }
}
