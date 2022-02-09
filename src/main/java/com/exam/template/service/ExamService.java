package com.exam.template.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.exam.template.vo.ExamVO;

public interface ExamService {
	List<?> exam1() throws SQLException;

	ExamVO exam2(int id) throws SQLException;
}
