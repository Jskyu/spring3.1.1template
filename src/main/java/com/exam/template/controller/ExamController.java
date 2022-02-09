package com.exam.template.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.template.service.ExamService;
import com.exam.template.vo.ExamVO;

@Controller("ExamController")
public class ExamController {

	@Autowired
	ExamService service;
	
	@RequestMapping(value = "/exam")
	public ModelAndView exam() throws SQLException{
		ModelAndView mav = new ModelAndView("exam1");
		List<ExamVO> list = (List<ExamVO>) service.exam1();
		mav.addObject("data", list);
		return mav;
	}
	
	@RequestMapping(value = "/exam2")
	public ModelAndView exam2() throws SQLException{
		ModelAndView mav = new ModelAndView("exam2");
		ExamVO vo = (ExamVO) service.exam2(1);
		mav.addObject("data", vo.getName());
		return mav;
	}
}
