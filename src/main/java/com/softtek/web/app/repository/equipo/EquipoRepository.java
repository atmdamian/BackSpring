package com.softtek.web.app.repository.equipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.equipo.Equipo;
import com.softtek.web.app.enums.QueryEnum;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>, JpaSpecificationExecutor<Equipo> {
	@Query("SELECT SUM(e.numNoEquipos) FROM Equipo e")
	Integer getTotal();
	
	@Query("SELECT COUNT(e) FROM Equipo e WHERE e.indActivo =:indActivo ")
	Integer getCount(Integer indActivo);
	
	List<Equipo> findByIndActivo(Integer indActivo);
	
	//Equipo findById(Integer cveEquipo);
	
	@Query("SELECT e FROM Equipo e WHERE e.desUnidadEspect LIKE %:descripcion")
	List<Equipo> findByDescripcion(@Param("descripcion") String descripcion);
	
}
