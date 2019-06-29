package cn.bms.pojo;

import java.util.Date;

/**
 * 座位表实体类
 */
public class SeatTable {
    private int id;     //座位id
    private int timeId;     //时段id
    private String seatRow;     //座位排座
    private int seatOrderNumber;        //座位序号
    private int hallId;     //影厅id
    private String seatStatic;      //状态
    private Date seatCreate;       //创建时间
    private Date seatModified;         //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
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
