package com.jacaranda.publicacion;

import java.time.LocalDateTime;

import com.jacaranda.usuario.Usuario;

public abstract class Publicacion implements Valorable, Comparable<Publicacion> {

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	protected static int codigoSiguiente;
	
	private Usuario usuario;
	
	public Publicacion(String texto, Usuario usuario) {
		setTexto(texto);
		this.usuario = usuario;
		this.codigo = codigoSiguiente++;
		this.fechaCreacion = LocalDateTime.now();
	}
	
	public abstract void setTexto(String texto);
	
	@Override
	public boolean valorar(String valora) {
		Valoracion valoracion = Valoracion.valueOf(valora.toUpperCase());
		boolean suma = false;
		if(Valoracion.MUYBUENA.equals(valoracion)){
			this.valoracion+=2;
			suma = true;
		}else if(Valoracion.NORMAL.equals(valoracion)){
			this.valoracion+=1;
			suma = true;
		}else if(Valoracion.MUYMALA.equals(valoracion)){
			this.valoracion-=2;
			suma = true;
		}
		
		return suma;
	}

	public String getTexto() {
		return texto;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	public String getLoginUsuario() {
		/*if(usuario!=null) {
			return usuario.getLogin();
		}else {
			return "";
		}*/
		
		return usuario!=null ? usuario.getLogin():"";
	}
	


	@Override
	public int compareTo(Publicacion o) {
		return this.valoracion-o.getValoracion();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		if (codigo != other.codigo)
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Publicación: "+this.texto+" \n"
				+ "Realizada por: "+this.usuario.getLogin()+"\n"
				+ "Valoración: "+this.valoracion+"\n"
				+ "Fecha de publicación: "+this.fechaCreacion;
	}
	
}
