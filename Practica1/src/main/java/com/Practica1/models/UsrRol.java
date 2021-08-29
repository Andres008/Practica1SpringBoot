package com.Practica1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usr_rol")
public class UsrRol {

	@Id
	@Column(name = "id_rol")
	private Long idRol;
	
	private String nombre;
	
	private String estado;
	
	private String observacion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usrRol")
	private List<UsrUsuario> usrUsuarios;
	
	public UsrRol() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public UsrRol(Long idRol, String nombre, String estado, String observacion) {
		super();
		this.idRol = idRol;
		this.nombre = nombre;
		this.estado = estado;
		this.observacion = observacion;
	}





	@Override
	public String toString() {
		return "UsrRol [idRol=" + idRol + ", nombre=" + nombre + ", estado=" + estado + ", observacion=" + observacion
				+ "]";
	}



	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public List<UsrUsuario> getUsrUsuarios() {
		return usrUsuarios;
	}

	public void setUsrUsuarios(List<UsrUsuario> usrUsuarios) {
		this.usrUsuarios = usrUsuarios;
	}
	
	
	
}
