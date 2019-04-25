package com.sample;


public class FreshProduct {

  private long id;
  private String productName;
  private String description;
  private double price;
  private long stock;
  private String picImg;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public String getPicImg() {
    return picImg;
  }

  public void setPicImg(String picImg) {
    this.picImg = picImg;
  }

}
