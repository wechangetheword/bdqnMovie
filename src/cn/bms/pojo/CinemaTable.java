package cn.bms.pojo;

import java.util.Date;

/**
 * 影院表实体
 */
public class CinemaTable {
    private int id;       //影院id
    private String cinemaName;      //影院名称
    private String cinemaAddress;       //影院地址
    private Date cinemaCreate;       //创建时间
    private Date cinemaModified;         //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public Date getCinemaCreate() {
        return cinemaCreate;
    }

    public void setCinemaCreate(Date cinemaCreate) {
        this.cinemaCreate = cinemaCreate;
    }

    public Date getCinemaModified() {
        return cinemaModified;
    }

    public void setCinemaModified(Date cinemaModified) {
        this.cinemaModified = cinemaModified;
    }
}
