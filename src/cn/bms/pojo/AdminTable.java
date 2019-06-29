package cn.bms.pojo;

import java.util.Date;

/**
 * 管理员表
 */
public class AdminTable {
    private int id;    //管理员id
    private String adminName;       //管理员用户名
    private String adminPassword;       //管理员密码
    private Date adminCreate;       //创建时间
    private Date adminModified;         //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
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
