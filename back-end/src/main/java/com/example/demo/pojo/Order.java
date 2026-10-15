package com.example.demo.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private  String userID;
    private  String scenicName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;
    private  Integer price;
    private   String ticketName;
    private  String ticlketClassfication;
    public Order(){

    }
    public Order(String orderID, String userID, String scenicName, LocalDateTime date, Integer price, String ticketName, String ticlketClassfication) {
        this.orderID = orderID;
        this.userID = userID;
        this.scenicName = scenicName;
        this.date = date;
        this.price = price;
        this.ticketName = ticketName;
        this.ticlketClassfication = ticlketClassfication;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTiclketClassfication() {
        return ticlketClassfication;
    }

    public void setTiclketClassfication(String ticlketClassfication) {
        this.ticlketClassfication = ticlketClassfication;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", userID='" + userID + '\'' +
                ", scenicName='" + scenicName + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", ticketName='" + ticketName + '\'' +
                ", ticlketClassfication='" + ticlketClassfication + '\'' +
                '}';
    }
}
