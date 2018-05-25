package com.niit.SpringDAO.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.SpringDAO.model.Register;

@Repository("registerdao")
@Transactional
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionFact;

	public boolean addEmployee(Register reg) {
		sessionFact.getCurrentSession().save(reg);
		return true;
	}

	public boolean deleteEmployee(int id) {
		Register reg=getEmployeebyId(id);
		if(reg!=null)
		{
			sessionFact.getCurrentSession().delete(reg);
				return true;
		}
		else
			return false;
	}

	public Register getEmployeebyId(int id) {
		return (Register) sessionFact.getCurrentSession().createQuery("from Register where id="+id).uniqueResult();
	}

	public boolean updateEmployee(Register reg) {
		sessionFact.getCurrentSession().update(reg);
		return true;
	}

	
	public List<Register> list() {
		return (List<Register>) sessionFact.getCurrentSession().createQuery("from Register").list();
	}

}
