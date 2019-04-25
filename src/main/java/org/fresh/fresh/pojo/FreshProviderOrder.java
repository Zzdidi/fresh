package com.sample;


public class FreshProviderOrder {

  private long id;
  private String orderNumber;
  private long productId;
  private long number;
  private long afterSaleId;
  private double pocketMoney;
  private long providerId;
  private long storeId;
  private java.sql.Timestamp transactionBeginTime;
  private java.sql.Timestamp transactionEndTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public long getAfterSaleId() {
    return afterSaleId;
  }

  public void setAfterSaleId(long afterSaleId) {
    this.afterSaleId = afterSaleId;
  }


  public double getPocketMoney() {
    return pocketMoney;
  }

  public void setPocketMoney(double pocketMoney) {
    this.pocketMoney = pocketMoney;
  }


  public long getProviderId() {
    return providerId;
  }

  public void setProviderId(long providerId) {
    this.providerId = providerId;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public java.sql.Timestamp getTransactionBeginTime() {
    return transactionBeginTime;
  }

  public void setTransactionBeginTime(java.sql.Timestamp transactionBeginTime) {
    this.transactionBeginTime = transactionBeginTime;
  }


  public java.sql.Timestamp getTransactionEndTime() {
    return transactionEndTime;
  }

  public void setTransactionEndTime(java.sql.Timestamp transactionEndTime) {
    this.transactionEndTime = transactionEndTime;
  }

}
