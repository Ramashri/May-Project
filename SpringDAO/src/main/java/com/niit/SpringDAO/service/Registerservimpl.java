package com.niit.SpringDAO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.SpringDAO.dao.RegisterDAO;
import com.niit.SpringDAO.model.Register;

@Service("servobj")
public class Registerservimpl implements Registerservice {
	
	@Autowired
	private RegisterDAO registerdao;

	public boolean addEmp(Register register) {
		
		return (registerdao.addEmployee(register));
	}

	public boolean deleteEmp(int empid) {
		
		return (registerdao.deleteEmployee(empid));
	}

	public boolean updateEmpbyId(Register register) {
		if(registerdao.getEmployeebyId(register.getId())!=null) {
			registerdao.updateEmployee(register);
			return true;
		}
		else {
			return false;
		}
	}

	public Register getById(int id) {
		
		return registerdao.getEmployeebyId(id);
	}

	public List<Register> list() {
		return registerdao.list();
	}

}
