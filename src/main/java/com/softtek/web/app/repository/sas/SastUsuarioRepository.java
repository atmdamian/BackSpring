package com.softtek.web.app.repository.sas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.dto.sas.SastUsuarioDTO;
import com.softtek.web.app.entity.sas.SastUsuario;

@Repository
public interface SastUsuarioRepository extends JpaRepository<SastUsuario, Long> {
}
