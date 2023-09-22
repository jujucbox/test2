package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.Dept;

@Repository
public class DBOracleDAO  implements DBDao{

	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		return session.selectList("selectAll");
	}

}
