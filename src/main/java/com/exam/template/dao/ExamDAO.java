package com.exam.template.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.exam.template.vo.ExamVO;

public interface ExamDAO {
	public List<?> exam1() throws SQLException;

	public ExamVO exam2(int id) throws SQLException;
}
