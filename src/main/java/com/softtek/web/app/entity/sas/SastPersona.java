package com.softtek.web.app.entity.sas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.softtek.web.app.dto.sas.SastPersonaDTO;


@Entity
@Table(name = "SAST_PERSONA")
public class SastPersona implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CVE_PERSONA")
  private Long cvePersona;
  
  @Column(name = "DES_CORREO_ELECTRONICO")
  private String desCorreoElectronico;
  
  @Column(name = "NOM_APELLIDO_MATERNO")
  private String nomApellidoMaterno;
  
  @Column(name = "NOM_APELLIDO_PATERNO")
  private String nomApellidoPaterno;
  
  @Column(name = "NOM_NOMBRE")
  private String nomNombre;
  
  @Column(name = "NUM_EXT")
  private Long numExt;
  
  @Column(name = "NUM_TELEFONO")
  private Long numTelefono;
  
  /*@OneToMany(mappedBy = "sastPersona", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SascConcopia> sascConcopias;
  
  @OneToMany(mappedBy = "sastPersona", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SastNotificacionesEnviada> sastNotificacionesEnviadas;
  
  @OneToMany(mappedBy = "sastPersonaSolicitante", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SastSolicitud> sastSolicitudesSolicitantes;
  
  @OneToMany(mappedBy = "sastPersonaAtencion", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SastSolicitud> sastSolicitudesAtencion;*/
  
  @OneToMany(mappedBy = "sastPersona", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SastUsuario> sastUsuarios;
  
 /* @OneToMany(mappedBy = "sastPersona", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
  private List<SastResponsable> sastResponsables;*/
  
  public SastPersona() {}
  
  
  
  public SastPersona(SastPersonaDTO sastPersonaDto) {
	super();
	this.cvePersona = sastPersonaDto.getCvePersona();
	this.desCorreoElectronico = sastPersonaDto.getDesCorreoElectronico();
	this.nomApellidoMaterno = sastPersonaDto.getNomApellidoMaterno();
	this.nomApellidoPaterno = sastPersonaDto.getNomApellidoPaterno();
	this.nomNombre = sastPersonaDto.getNomNombre();
	this.numExt = sastPersonaDto.getNumExt();
	this.numTelefono = sastPersonaDto.getNumTelefono();
}



public Long getCvePersona() {
    return this.cvePersona;
  }
  
  public void setCvePersona(Long cvePersona) {
    this.cvePersona = cvePersona;
  }
  
  public String getDesCorreoElectronico() {
    return this.desCorreoElectronico;
  }
  
  public void setDesCorreoElectronico(String desCorreoElectronico) {
    this.desCorreoElectronico = desCorreoElectronico;
  }
  
  public String getNomApellidoMaterno() {
    return this.nomApellidoMaterno;
  }
  
  public void setNomApellidoMaterno(String nomApellidoMaterno) {
    this.nomApellidoMaterno = nomApellidoMaterno;
  }
  
  public String getNomApellidoPaterno() {
    return this.nomApellidoPaterno;
  }
  
  public void setNomApellidoPaterno(String nomApellidoPaterno) {
    this.nomApellidoPaterno = nomApellidoPaterno;
  }
  
  public String getNomNombre() {
    return this.nomNombre;
  }
  
  public void setNomNombre(String nomNombre) {
    this.nomNombre = nomNombre;
  }
  
  public Long getNumExt() {
    return this.numExt;
  }
  
  public void setNumExt(Long numExt) {
    this.numExt = numExt;
  }
  
  public Long getNumTelefono() {
    return this.numTelefono;
  }
  
  public void setNumTelefono(Long numTelefono) {
    this.numTelefono = numTelefono;
  }
  
 /* public List<SascConcopia> getSascConcopias() {
    return this.sascConcopias;
  }
  
  public void setSascConcopias(List<SascConcopia> sascConcopias) {
    this.sascConcopias = sascConcopias;
  }
  
  public List<SastNotificacionesEnviada> getSastNotificacionesEnviadas() {
    return this.sastNotificacionesEnviadas;
  }
  
  public void setSastNotificacionesEnviadas(List<SastNotificacionesEnviada> sastNotificacionesEnviadas) {
    this.sastNotificacionesEnviadas = sastNotificacionesEnviadas;
  }*/
  
  public List<SastUsuario> getSastUsuarios() {
    return this.sastUsuarios;
  }
  
  public void setSastUsuarios(List<SastUsuario> sastUsuarios) {
    this.sastUsuarios = sastUsuarios;
  }
  
  /*public List<SastResponsable> getSastResponsables() {
    return this.sastResponsables;
  }
  
  public void setSastResponsables(List<SastResponsable> sastResponsables) {
    this.sastResponsables = sastResponsables;
  }
  
  public List<SastSolicitud> getSastSolicitudesSolicitantes() {
    return this.sastSolicitudesSolicitantes;
  }
  
  public void setSastSolicitudesSolicitantes(List<SastSolicitud> sastSolicitudesSolicitantes) {
    this.sastSolicitudesSolicitantes = sastSolicitudesSolicitantes;
  }
  
  public List<SastSolicitud> getSastSolicitudesAtencion() {
    return this.sastSolicitudesAtencion;
  }
  
  public void setSastSolicitudesAtencion(List<SastSolicitud> sastSolicitudesAtencion) {
    this.sastSolicitudesAtencion = sastSolicitudesAtencion;
  }*/
  
  public boolean equals(Object obj) {
    if (!(obj instanceof SastPersona))
      return false; 
    SastPersona other = (SastPersona)obj;
    if ((this.cvePersona == null && other.cvePersona != null) || (this.cvePersona != null && 
      !this.cvePersona.equals(other.cvePersona)))
      return false; 
    return true;
  }
  
  public int hashCode() {
    int hash = 0;
    hash += (this.cvePersona != null) ? this.cvePersona.hashCode() : 0;
    return hash;
  }
  
  public String getNombreCompleto() {
    return getNomNombre() + " " + getNomApellidoPaterno() + " " + getNomApellidoMaterno();
  }
}
