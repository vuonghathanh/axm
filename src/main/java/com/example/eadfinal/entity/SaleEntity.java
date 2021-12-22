package com.example.eadfinal.entity;

import javax.persistence.*;

@Entity
@Table(name = "sale")
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SINo;

    @Column(name = "salesmanID")
    private String SalesmanID;

    @Column(name = "salesmanName")
    private String SalesmanName;

    @Column(name = "DOS")
    private String DOS;

    @Column(name = "prodID")
    private int ProdID;

    @ManyToOne
    @JoinColumn(name = "ProdID" , insertable = false , updatable = false)
    private ProductEntity product;

    public SaleEntity() {
    }

    public int getSINo() {
        return SINo;
    }

    public void setSINo(int SINo) {
        this.SINo = SINo;
    }

    public String getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        SalesmanID = salesmanID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public String getDOS() {
        return DOS;
    }

    public void setDOS(String DOS) {
        this.DOS = DOS;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
