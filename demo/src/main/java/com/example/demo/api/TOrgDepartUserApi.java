package com.example.demo.api;

import com.example.demo.api.dto.TOrgDepartUserDTO;
import com.example.demo.entity.TOrgDepartUser;

import java.util.Optional;

/**
 * created by zhanglei on 2019/12/31
 */
public interface TOrgDepartUserApi {


    /**
     *
     * @param guid
     * @return
     */
    Optional<TOrgDepartUserDTO> selectByPrimaryKey(String guid);

}
