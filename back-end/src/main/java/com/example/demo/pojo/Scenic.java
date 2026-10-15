package com.example.demo.pojo;


public class Scenic {
    private String scenicName;
    private String province;
    private String city;
    private Integer maxLimit;
    private Integer scenicID;

    public Scenic(String scenicName, String province, String city, Integer maxLimit, Integer scenicID) {
        this.scenicName = scenicName;
        this.province = province;
        this.city = city;
        this.maxLimit = maxLimit;
        this.scenicID = scenicID;
    }
    public Scenic() {}
    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Integer getScenicID() {
        return scenicID;
    }

    public void setScenicID(Integer scenicID) {
        this.scenicID = scenicID;
    }

    @Override
    public String toString() {
        return "Scenic{" +
                "scenicName='" + scenicName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", maxLimit=" + maxLimit +
                ", scenicID=" + scenicID +
                '}';
    }
}