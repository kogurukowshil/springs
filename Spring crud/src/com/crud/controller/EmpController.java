package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import com.crud.bean.Emp;
import com.crud.dao.EmpDAO;
@Controller
public class EmpController {
@Autowired
EmpDAO dao;

@RequestMapping("/empform")
public  ModelAndView showform() {
	return new ModelAndView("empform","command",new Emp());
}


	@RequestMapping(value="/save",method=RequestMethod.POST)
	public  ModelAndView save(@ModelAttribute("emp")Emp emp){
		dao.save(emp);
		return new ModelAndView("redirect:/viewmap");
	}
	@RequestMapping("/viewmap")
	public  ModelAndView viewemp() {
		List<Emp> list=dao.getEmployees();
		return new  ModelAndView("viewmap","list",list);
	}
		@RequestMapping(value="/editemp/{id}")
		public  ModelAndView edit(@PathVariable int id) {
			Emp emp=dao.getEmpById(id);
			return new  ModelAndView("empeditform","command",emp);
		}
		
		@RequestMapping(value="/editsave",method=RequestMethod.POST)
		
		public ModelAndView editsave(@ModelAttribute("emp")Emp emp) {
			dao.update(emp);
			return new ModelAndView("redirect:/viewmap");
		}
		@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.GET)
		public ModelAndView delete(@PathVariable int id) {
			dao.delete(id);
			return new ModelAndView("redirect:/viewmap");
		}

	
}
