package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Tweet extends Publicacion {
	
	private static final int NUM_MAXIMO_CARACTERES = 50;

	public Tweet(String texto, Usuario usuario) {
		super(texto, usuario);
	}




	@Override
	public void setTexto(String texto) {
		if (texto.length()<= NUM_MAXIMO_CARACTERES) {
			this.texto = texto;
		}else {
			throw new PublicacionException("El número máximo de caracteres es "+ NUM_MAXIMO_CARACTERES);
		}

	}
	
	public String toString() {
		return this.getClass().getSimpleName()+"\n"+ super.toString();
	}

}
