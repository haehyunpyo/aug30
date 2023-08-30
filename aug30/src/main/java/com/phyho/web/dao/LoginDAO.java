package com.phyho.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.phyho.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);


}
