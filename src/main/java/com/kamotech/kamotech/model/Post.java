package com.kamotech.kamotech.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Post implements Serializable {

    @Id //setting the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //tell him how to generate this information
    @Column(nullable = false, updatable = false) //to specify some column information
    private Long id;
    private String countryDeparture;
    private String countryArrival;
    private String cityDeparture;
    private String cityArrival;
    private Long weight;
    private String date;
    private Long kiloPrice;
    private Long docPrice;
    private String info;

    @Column(nullable = false)
    private String payment;

    // Generate constructor


    public Post() {}

    public Post(Long id, String countryDeparture, String countryArrival, String cityDeparture, String cityArrival, Long weight, String date, Long kiloPrice, Long docPrice, String info, String payment) {
        this.id = id;
        this.countryDeparture = countryDeparture;
        this.countryArrival = countryArrival;
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.weight = weight;
        this.date = date;
        this.kiloPrice = kiloPrice;
        this.docPrice = docPrice;
        this.info = info;
        this.payment = payment;
    }

    // Generate Getters and Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCountryDeparture() {
        return countryDeparture;
    }
    public void setCountryDeparture(String countryDeparture) {
        this.countryDeparture = countryDeparture;
    }
    public String getCountryArrival() {
        return countryArrival;
    }
    public void setCountryArrival(String countryArrival) {
        this.countryArrival = countryArrival;
    }
    public String getCityDeparture() {
        return cityDeparture;
    }
    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }
    public String getCityArrival() {
        return cityArrival;
    }
    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }
    public Long getWeight() {
        return weight;
    }
    public void setWeight(Long weight) {
        this.weight = weight;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Long getKiloPrice() {
        return kiloPrice;
    }
    public void setKiloPrice(Long kiloPrice) {
        this.kiloPrice = kiloPrice;
    }
    public Long getDocPrice() {
        return docPrice;
    }
    public void setDocPrice(Long docPrice) {
        this.docPrice = docPrice;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }

    //Generate toString


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", countryDeparture='" + countryDeparture + '\'' +
                ", countryArrival='" + countryArrival + '\'' +
                ", cityDeparture='" + cityDeparture + '\'' +
                ", cityArrival='" + cityArrival + '\'' +
                ", weight=" + weight +
                ", date='" + date + '\'' +
                ", kiloPrice=" + kiloPrice +
                ", docPrice=" + docPrice +
                ", info='" + info + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
