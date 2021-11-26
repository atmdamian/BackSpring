package com.softtek.web.app.controller.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.dto.CourseDto;
import com.softtek.web.app.entity.Course.Course;
import com.softtek.web.app.entity.employe.Employe;
import com.softtek.web.app.service.EmployeService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/employe")
@CrossOrigin
@Api(value = "Employe Controller", description = "Administrar Employe")
public class EmployeController {
	
	@Autowired
	EmployeService employeService;
	
	@PostMapping("saveEmploye")
	public ResponseEntity<String> saveEmploye(@RequestBody List<Employe> employeList) {
		employeService.save(employeList);
		return ResponseEntity.ok("data save");
		
		
		
	}
}
