package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.Dept;
import com.example.service.DBService;

@Controller
public class DeptController {
	@Autowired
	DBService service;
	
	@RequestMapping("/list")
	public String getDeptList(Model m) {
		List<Dept> allData =service.list();
		m.addAttribute("allData", allData);
		return "list";
	}
}
