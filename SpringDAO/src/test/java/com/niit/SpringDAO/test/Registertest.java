package com.niit.SpringDAO.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.SpringDAO.config.AppConfig;
import com.niit.SpringDAO.model.Register;
import com.niit.SpringDAO.service.Registerservice;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class) 
public class Registertest extends TestCase {
	
	@Autowired
	private Registerservice rservice;
	
	Register reg;
	
	@Before
	public void setUp() throws Exception 
	{
		reg=new Register();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	@Ignore
	public void Adddata() 
	{
		reg.setId(101);
		reg.setName("sugan");;
		reg.setEmailid("sugan@gmail.com");
		reg.setPassword("sugan");
		reg.setAge(22);
		reg.setAddress("bangalore");
		reg.setDob("06/06/1995");
		reg.setGender("female");
		reg.setPhone("9808799434");
		reg.setQualification("B.E");
	assertEquals("Success",true,rservice.addEmp(reg));
	}
	
	/*@Test
	public void deletecheck()
	{
		assertEquals("not found",true,rservice.deleteEmp(104));
	}*/
	
	@Test
	@Ignore
	public void update() {
		
	 reg=(Register)rservice.getById(100);
		
		reg.setAddress("chennai");
		
		System.out.println(reg.getAddress());
		assertEquals("updated", true,rservice.updateEmpbyId(reg));
	}
	
	@Test
	
	public void list() {
		List<Register> employeeList = new ArrayList<Register>();
		employeeList = rservice.list();
		System.out.println("Size of employeeList = "+employeeList);
		System.out.println(rservice.getById(100));
		assertEquals("Success", true, employeeList.size() != 0);
	}
	
	@Test
	@Ignore
	public void getEmpById() {
		Register obj;
		obj = rservice.getById(101);
		assertEquals("Success", true, obj!=null);
	}

}
