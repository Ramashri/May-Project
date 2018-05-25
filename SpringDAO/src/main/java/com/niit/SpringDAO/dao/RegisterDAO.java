package com.niit.SpringDAO.dao;

import java.util.List;

import com.niit.SpringDAO.model.Register;

public interface RegisterDAO {
	
	public List<Register> list();
	public boolean addEmployee(Register reg);
	public boolean deleteEmployee(int id);
	public Register getEmployeebyId(int id);
	public boolean updateEmployee(Register reg);
}
