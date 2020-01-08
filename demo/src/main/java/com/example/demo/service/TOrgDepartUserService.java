package com.example.demo.service;

import com.example.demo.entity.TOrgDepartUser;
import com.example.demo.mapper.TOrgDepartUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created by zhanglei on 2019/12/31
 */
public class TOrgDepartUserService implements TOrgDepartUserMapper {


    @Autowired
    private TOrgDepartUserMapper tOrgDepartUserMapper;

    @Override
    public int deleteByPrimaryKey(String guid) {
        return tOrgDepartUserMapper.deleteByPrimaryKey(guid);
    }

    @Override
    public int insert(TOrgDepartUser record) {
        return tOrgDepartUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TOrgDepartUser record) {
        return tOrgDepartUserMapper.insertSelective(record);
    }

    @Override
    public TOrgDepartUser selectByPrimaryKey(String guid) {
        return tOrgDepartUserMapper.selectByPrimaryKey(guid);
    }

    @Override
    public int updateByPrimaryKeySelective(TOrgDepartUser record) {
        return tOrgDepartUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TOrgDepartUser record) {
        return tOrgDepartUserMapper.updateByPrimaryKey(record);
    }
}
