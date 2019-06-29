package cn.bms.pojo;

import java.util.Date;

/**
 * 时段表实体类
 */
public class TimeTable {
    private int id;     //时段id
    private String  timeTime;       //时段
    private int hallId;     //影厅id
    private int movieId;            //电影id
    private int choosedSeat;        //已选座位
    private int unchoosedSeat;      //未选座位数
    private int saleSeat;       //已售座位
    private Date timeCreate;       //创建时间
    private Date timeModified;         //修改时间

    public int getChoosedSeat() {
        return choosedSeat;
    }

    public void setChoosedSeat(int choosedSeat) {
        this.choosedSeat = choosedSeat;
    }

    public int getUnchoosedSeat() {
        return unchoosedSeat;
    }

    public void setUnchoosedSeat(int unchoosedSeat) {
        this.unchoosedSeat = unchoosedSeat;
    }

    public int getSaleSeat() {
        return saleSeat;
    }

    public void setSaleSeat(int saleSeat) {
        this.saleSeat = saleSeat;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeTime() {
        return timeTime;
    }

    public void setTimeTime(String timeTime) {
        this.timeTime = timeTime;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }
}
