package com.jacaranda;

import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;

public class MainApp {

	public static void main(String[] args) {
		
		Publicacion tweet = new Tweet("asdfg", 	new Usuario("jm", ""));
		System.out.println(tweet);
	}

}
