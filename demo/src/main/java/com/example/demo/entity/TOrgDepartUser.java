package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class TOrgDepartUser implements Serializable {
    private String guid;

    private String departId;

    private String departCode;

    private String userId;

    private String userCode;

    private String leaderFlag;

    private String comments;

    private Date createDate;

    private String createPerson;

    private Date modiDate;

    private String modiPerson;

    private static final long serialVersionUID = 1L;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getLeaderFlag() {
        return leaderFlag;
    }

    public void setLeaderFlag(String leaderFlag) {
        this.leaderFlag = leaderFlag == null ? null : leaderFlag.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getModiDate() {
        return modiDate;
    }

    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    public String getModiPerson() {
        return modiPerson;
    }

    public void setModiPerson(String modiPerson) {
        this.modiPerson = modiPerson == null ? null : modiPerson.trim();
    }
}