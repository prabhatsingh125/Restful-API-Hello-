package com.example.hello.entity;

import javax.persistence.*;

@Entity
@Table(name="bicycle_table")
public class Bicycle {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id
    private Integer bicycleId;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "model_name")
    private String modelName;
    private Double price;

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
