package com.example.demo.mapper;

import com.example.demo.entity.TOrgDepartUser;

public interface TOrgDepartUserMapper {
    int deleteByPrimaryKey(String guid);

    int insert(TOrgDepartUser record);

    int insertSelective(TOrgDepartUser record);

    TOrgDepartUser selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(TOrgDepartUser record);

    int updateByPrimaryKey(TOrgDepartUser record);
}