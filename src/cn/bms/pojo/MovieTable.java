package cn.bms.pojo;

import java.util.Date;

/**
 * 电影表实体类
 */
public class MovieTable {
    private int id;            //电影id
    private String movieName;           //电影名称
    private String englishName;         //英语名称
    private Date movieDatetime;         //上映时间
    private String movieType;       //类型
    private String movie3d;             //是否是3D
    private String movieImax;       //是否是IMAX
    private int movieScore;     //评分
    private String movieImg;        //海报路径
    private String movieCarousel;       //轮播图
    private String movieIntroduction;   //简介
    private String movieDuration;       //电影时长
    private Date movieCreate;       //创建时间
    private Date movieModified;         //修改时间

    public String getMovieCarousel() {
        return movieCarousel;
    }

    public void setMovieCarousel(String movieCarousel) {
        this.movieCarousel = movieCarousel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Date getMovieDatetime() {
        return movieDatetime;
    }

    public void setMovieDatetime(Date movieDatetime) {
        this.movieDatetime = movieDatetime;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovie3d() {
        return movie3d;
    }

    public void setMovie3d(String movie3d) {
        this.movie3d = movie3d;
    }

    public String getMovieImax() {
        return movieImax;
    }

    public void setMovieImax(String movieImax) {
        this.movieImax = movieImax;
    }

    public int getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(int movieScore) {
        this.movieScore = movieScore;
    }

    public String getMovieImg() {
        return movieImg;
    }

    public void setMovieImg(String movieImg) {
        this.movieImg = movieImg;
    }

    public String getMovieIntroduction() {
        return movieIntroduction;
    }

    public void setMovieIntroduction(String movieIntroduction) {
        this.movieIntroduction = movieIntroduction;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }

    public Date getMovieCreate() {
        return movieCreate;
    }

    public void setMovieCreate(Date movieCreate) {
        this.movieCreate = movieCreate;
    }

    public Date getMovieModified() {
        return movieModified;
    }

    public void setMovieModified(Date movieModified) {
        this.movieModified = movieModified;
    }
}
