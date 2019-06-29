package cn.bms.pojo;

import java.util.Date;

/**
 * 剧照表
 */
public class PhotoTable {
    private int id;        //剧照id
    private int movieId;            //电影id
    private String photoPath;       //剧照路径
    private Date adminCreate;       //创建时间
    private Date adminModified;         //修改时间

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

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Date getAdminCreate() {
        return adminCreate;
    }

    public void setAdminCreate(Date adminCreate) {
        this.adminCreate = adminCreate;
    }

    public Date getAdminModified() {
        return adminModified;
    }

    public void setAdminModified(Date adminModified) {
        this.adminModified = adminModified;
    }
}
