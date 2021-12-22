package com.example.eadfinal.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProdID;
    @Column(name = "prodName")
    private String ProdName;
    @Column(name = "description")
    private String Description;
    @Column(name = "dateOfManf")
    private String DateOfManf;
    @Column(name = "price")
    private int price;

    @OneToMany(mappedBy = "product")
    private List<SaleEntity> sales;

    public ProductEntity() {
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(String dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<SaleEntity> getSales() {
        return sales;
    }

    public void setSales(List<SaleEntity> sales) {
        this.sales = sales;
    }
}
