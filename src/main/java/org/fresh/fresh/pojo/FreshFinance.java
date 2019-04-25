package com.sample;


public class FreshFinance {

  private long id;
  private long storeId;
  private long providerId;
  private String productId;
  private java.sql.Timestamp orderdate;
  private long number;
  private double cost;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public long getProviderId() {
    return providerId;
  }

  public void setProviderId(long providerId) {
    this.providerId = providerId;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public java.sql.Timestamp getOrderdate() {
    return orderdate;
  }

  public void setOrderdate(java.sql.Timestamp orderdate) {
    this.orderdate = orderdate;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

}
