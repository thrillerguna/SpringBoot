package javabrains_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javabrains_springboot.pojo.Department;
import javabrains_springboot.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value ="/depts")
	public List<Department> getAllDepartments()
	{
		System.out.println("inside");
		return departmentService.getDepts();
	}
	
	@RequestMapping("/depts/{id}")
	public Department getDepartment(@PathVariable String id)
	{
		return departmentService.getDept(id);
	}
	
	@RequestMapping(value="/depts", method=RequestMethod.POST)
	public String addDepartment(@RequestBody Department dept)
	{
		//Hi
		departmentService.addDept(dept);
		return "Success";
	}
	
	@RequestMapping(value="/depts", method=RequestMethod.PUT)
	public String updateDepartment(@RequestBody Department dept)
	{
		departmentService.updateDept(dept);
		return "Success";
	}
	
	@RequestMapping(value="/depts/{id}", method=RequestMethod.DELETE)
	public String deleteDepartment(@PathVariable String id)
	{
		//hi
		departmentService.deleteDept(id);
		return "Success";
	}

}
