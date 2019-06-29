package cn.bms.pojo;

import java.util.Date;

/**
 * 日期表实体类
 */
public class DateTable {
    private int id;     //日期id
    private int movieId;            //电影id
    private Date dateTime1;     //时间1
    private Date dateTime2;     //时间2
    private Date dateTime3;     //时间3
    private Date dateCreate;       //创建时间
    private Date dateModified;         //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Date getDateTime1() {
        return dateTime1;
    }

    public void setDateTime1(Date dateTime1) {
        this.dateTime1 = dateTime1;
    }

    public Date getDateTime2() {
        return dateTime2;
    }

    public void setDateTime2(Date dateTime2) {
        this.dateTime2 = dateTime2;
    }

    public Date getDateTime3() {
        return dateTime3;
    }

    public void setDateTime3(Date dateTime3) {
        this.dateTime3 = dateTime3;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
