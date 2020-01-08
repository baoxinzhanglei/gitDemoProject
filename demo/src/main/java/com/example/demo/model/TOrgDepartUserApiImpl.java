package com.example.demo.model;

import com.example.demo.api.TOrgDepartUserApi;
import com.example.demo.api.dto.TOrgDepartUserDTO;
import com.example.demo.entity.TOrgDepartUser;
import com.example.demo.service.TOrgDepartUserService;
import com.example.demo.util.DemoBeanUtil;
import com.example.demo.util.DemoStringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * created by zhanglei on 2019/12/31
 */
public class TOrgDepartUserApiImpl implements TOrgDepartUserApi {

    @Autowired
    private TOrgDepartUserService tOrgDepartUserService;


    @Override
    public Optional<TOrgDepartUserDTO> selectByPrimaryKey(String guid) {
        Optional<TOrgDepartUser> tOrgDepartUser = Optional.ofNullable(tOrgDepartUserService.selectByPrimaryKey(guid));
        Optional<TOrgDepartUserDTO> tOrgDepartUserDTO = Optional.of(new TOrgDepartUserDTO());
        DemoBeanUtil.copyProperties(tOrgDepartUser, tOrgDepartUserDTO);
        return tOrgDepartUserDTO;
    }
}
