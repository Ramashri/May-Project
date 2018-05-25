package com.niit.SpringDAO.service;

import java.util.List;

import com.niit.SpringDAO.model.Register;

public interface Registerservice {
	
	public List<Register> list();
	public boolean addEmp(Register register);
	public boolean deleteEmp(int empid);
	public boolean updateEmpbyId(Register register);
	public Register getById(int id);

}
