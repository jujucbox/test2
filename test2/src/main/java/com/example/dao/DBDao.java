package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.example.dto.Dept;

public interface DBDao {
	List<Dept> list(SqlSessionTemplate session);
}
