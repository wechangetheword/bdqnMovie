package cn.bms.pojo;

import java.util.Date;

/**
 * 表实体类
 */
public class OrderTable {
    private int id;        //订单表id
    private int userId;     //用户id
    private int movieId;            //电影id
    private int cinemaId;       //影院id
    private int timeId;     //时段id
    private int hallId;     //影厅id
    private int seatId;     //座位id
    private double price;       //单价
    private double totalPrice;      //总价
    private Date orderCreate;       //创建时间
    private Date orderModified;         //修改时间

    public Date getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Date orderCreate) {
        this.orderCreate = orderCreate;
    }

    public Date getOrderModified() {
        return orderModified;
    }

    public void setOrderModified(Date orderModified) {
        this.orderModified = orderModified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
