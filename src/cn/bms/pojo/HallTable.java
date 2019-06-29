package cn.bms.pojo;

import java.util.Date;

/**
 * 影厅表实体类
 */
public class HallTable {
    private int id;     //影厅id
    private int hallNumber;     //影厅号
    private int cinemaId;       //影院id
    private int seatNumber;     //座位数
    private Date hallCreate;       //创建时间
    private Date hallModified;         //修改时间

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Date getHallCreate() {
        return hallCreate;
    }

    public void setHallCreate(Date hallCreate) {
        this.hallCreate = hallCreate;
    }

    public Date getHallModified() {
        return hallModified;
    }

    public void setHallModified(Date hallModified) {
        this.hallModified = hallModified;
    }
}
