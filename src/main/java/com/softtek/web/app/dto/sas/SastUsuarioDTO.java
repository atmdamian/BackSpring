package com.softtek.web.app.dto.sas;

import java.util.Date;
import java.util.List;

import com.softtek.web.app.entity.sas.SascRol;
import com.softtek.web.app.entity.sas.SastHistEstusu;
import com.softtek.web.app.entity.sas.SastPersona;
import com.softtek.web.app.entity.sas.SastUsuario;

public class SastUsuarioDTO {

	private Long cveUsuario;

	private String desContrasenia;

	private Date fecActualizacionContra;

	private String nomUsuario;

	private Integer indInvComp;

	//private SascRol sascRol;

	private SastPersona sastPersona;

	/*
	 * @OneToMany(mappedBy = "sastUsuario", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastDelUsuario> sastDelUsuarios;
	 */

	//private List<SastHistEstusu> sastHistEstusus;

	public SastUsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SastUsuarioDTO(SastUsuario sastUsuario) {
		super();
		this.cveUsuario = sastUsuario.getCveUsuario();
		this.desContrasenia = sastUsuario.getDesContrasenia();
		this.fecActualizacionContra = sastUsuario.getFecActualizacionContra();
		this.nomUsuario = sastUsuario.getNomUsuario();
		this.indInvComp = sastUsuario.getIndInvComp();
		//this.sascRol = sastUsuario.getSascRol();
		this.sastPersona = sastUsuario.getSastPersona();
		//this.sastHistEstusus = sastUsuario.getSastHistEstusus();
	}

	public Long getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(Long cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public String getDesContrasenia() {
		return desContrasenia;
	}

	public void setDesContrasenia(String desContrasenia) {
		this.desContrasenia = desContrasenia;
	}

	public Date getFecActualizacionContra() {
		return fecActualizacionContra;
	}

	public void setFecActualizacionContra(Date fecActualizacionContra) {
		this.fecActualizacionContra = fecActualizacionContra;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public Integer getIndInvComp() {
		return indInvComp;
	}

	public void setIndInvComp(Integer indInvComp) {
		this.indInvComp = indInvComp;
	}

	/*public SascRol getSascRol() {
		return sascRol;
	}

	public void setSascRol(SascRol sascRol) {
		this.sascRol = sascRol;
	}*/

	public SastPersona getSastPersona() {
		return sastPersona;
	}

	public void setSastPersona(SastPersona sastPersona) {
		this.sastPersona = sastPersona;
	}

	/*public List<SastHistEstusu> getSastHistEstusus() {
		return sastHistEstusus;
	}

	public void setSastHistEstusus(List<SastHistEstusu> sastHistEstusus) {
		this.sastHistEstusus = sastHistEstusus;
	}*/

}
