package com.yanbin.pojo;

import java.util.Date;
import java.util.List;

public class Flight {
    private Integer id;

    private String model;

    private Date offtime;

    private Date endtime;

    private String airport;

    private String duration;

    private String transit;

    private Integer fprice;

    private Date time;

    private String startcity;

    private String endcity;



    //一方
    private List<Website> websites;

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Date getOfftime() {
        return offtime;
    }

    public void setOfftime(Date offtime) {
        this.offtime = offtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport == null ? null : airport.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit == null ? null : transit.trim();
    }

    public Integer getFprice() {
        return fprice;
    }

    public void setFprice(Integer fprice) {
        this.fprice = fprice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStartcity() {
        return startcity;
    }

    public void setStartcity(String startcity) {
        this.startcity = startcity == null ? null : startcity.trim();
    }

    public String getEndcity() {
        return endcity;
    }

    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", offtime=" + offtime +
                ", endtime=" + endtime +
                ", airport='" + airport + '\'' +
                ", duration='" + duration + '\'' +
                ", transit='" + transit + '\'' +
                ", fprice=" + fprice +
                ", time=" + time +
                ", startcity='" + startcity + '\'' +
                ", endcity='" + endcity + '\'' +
                ", websites=" + websites +
                '}';
    }
}
