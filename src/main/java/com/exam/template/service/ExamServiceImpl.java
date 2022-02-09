package com.exam.template.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.template.dao.ExamDAO;
import com.exam.template.vo.ExamVO;

@Service("ExamService")
public class ExamServiceImpl implements ExamService{
	
	@Autowired
	ExamDAO dao;
	
	@Override
	public List<?> exam1() throws SQLException{
		return dao.exam1();
	}

	@Override
	public ExamVO exam2(int id) throws SQLException{
		return dao.exam2(id);
	}
}
