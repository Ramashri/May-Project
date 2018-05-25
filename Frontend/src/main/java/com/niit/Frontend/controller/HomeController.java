package com.niit.Frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.SpringDAO.dao.RegisterDAO;
import com.niit.SpringDAO.model.Register;
import com.niit.SpringDAO.service.Registerservice;

@RestController
@RequestMapping("/api/employee")
public class HomeController {
	
	@Autowired
	 private Registerservice servobj;
	
	 
	 @GetMapping
	 public List<Register> list()
	 {
		 List<Register> detail = servobj.list();
		 
		return detail;
		 
	 }
	 
	 /*@RequestMapping(value="/detail", method=RequestMethod.GET)
	   public ResponseEntity<List<Register>> list() {
		List<Register> listblog = servobj.list();
		  
		return new ResponseEntity<List<Register>>(listblog, HttpStatus.OK);
		
	 }*/
	
	 
	 /*@GetMapping("/viewdata/{employeeid}")
	 public ResponseEntity<Register>getEmployees(@PathVariable("employeeid")int employeeid)
	 {
		 if(serveobj.getEmployeebyId(employeeid)!=null)
		 {
			 return new ResponseEntity<Employee>(serveobj.getEmployeebyId(employeeid),HttpStatus.OK);
		 }
		 else
		 {
			 return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
			 
		 }
	 }
	 
	 @GetMapping("delete/{employeeid}")
	 public ResponseEntity <Void> deleteEmployee(@PathVariable("employeeid")int employeeid)
	 {
		 if(serveobj.getEmployeebyId(employeeid)!=null)
		 {
			 
			 serveobj.deleteService(employeeid);
			 
			 return new ResponseEntity<Void>(HttpStatus.OK);
			 
		 }
		 else
		 {
			 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			 
		 }
	 }
	 @PostMapping("/adding")
		public ResponseEntity<Void> addEmployee(@RequestBody Register employee) {
			
				serveobj.addservice(employee);
				return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
	@PutMapping("update/{employeeid}")
		public ResponseEntity<Void> updateEmployee(@RequestBody Register employee) {
			
			if(serveobj.getEmployeebyId(employee.getEmployeeid())!=null) {
				serveobj.updateEmployee(employee);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else {
				
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}*/

}
