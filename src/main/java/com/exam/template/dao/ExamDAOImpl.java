package com.exam.template.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.template.vo.ExamVO;

@Repository("ExamDAO")
public class ExamDAOImpl implements ExamDAO{
	
    @Autowired
    private SqlSession query;
 
    @Override
    public List<?> exam1() throws SQLException {
        return (List<?>) query.selectList("temp_mapper.exam1");
    }

	@Override
	public ExamVO exam2(int id) throws SQLException {
		return (ExamVO) query.selectOne("temp_mapper.exam2", id);
	}
}