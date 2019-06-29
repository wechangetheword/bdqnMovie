package cn.bms.pojo;

import java.util.Date;

/**
 * 电影院影厅对应的具体的表
 */
public class HallSeatTable {
    private int id;     //座位id
    private String seatRow;     //座位排座
    private int seatOrderNumber;        //座位序号
    private int hallId;     //影厅id
    private String seatStatic;      //状态
    private Date seatCreate;       //创建时间
    private Date seatModified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatOrderNumber() {
        return seatOrderNumber;
    }

    public void setSeatOrderNumber(int seatOrderNumber) {
        this.seatOrderNumber = seatOrderNumber;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getSeatStatic() {
        return seatStatic;
    }

    public void setSeatStatic(String seatStatic) {
        this.seatStatic = seatStatic;
    }

    public Date getSeatCreate() {
        return seatCreate;
    }

    public void setSeatCreate(Date seatCreate) {
        this.seatCreate = seatCreate;
    }

    public Date getSeatModified() {
        return seatModified;
    }

    public void setSeatModified(Date seatModified) {
        this.seatModified = seatModified;
    }
}
