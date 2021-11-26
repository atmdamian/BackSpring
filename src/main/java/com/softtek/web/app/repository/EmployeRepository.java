package com.softtek.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.employe.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
