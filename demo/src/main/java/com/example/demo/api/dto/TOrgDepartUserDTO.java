package com.example.demo.api.dto;

import com.example.demo.util.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanglei
 */

@Getter
@Setter
public class TOrgDepartUserDTO extends Entity {



    private String guid;

    private String departId;

    private String departCode;

    private String userId;

    private String userCode;

    private String leaderFlag;

    private String comments;



}