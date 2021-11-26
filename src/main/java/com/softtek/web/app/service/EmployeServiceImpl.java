package com.softtek.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.entity.employe.Employe;
import com.softtek.web.app.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService{
	@Autowired
	EmployeRepository employeRepository;
	@Override
	public void save(List<Employe> employe) {
		employeRepository.saveAll(employe);
	}

}
