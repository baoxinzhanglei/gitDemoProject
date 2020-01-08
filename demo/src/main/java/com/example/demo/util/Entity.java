package com.example.demo.util;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * created by zhanglei on 2019/12/30
 */
@Data
public class Entity implements Serializable {

    private String createPerson = null;

    private Date createDate = null;

    private String modiPerson = null;

    private Date modiDate = null;
}
