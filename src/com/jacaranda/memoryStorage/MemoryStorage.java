package com.jacaranda.memoryStorage;

import com.jacaranda.usuario.Usuario;

public class MemoryStorage {
	
	private static final int NUM_MAXIMO_USUARIOS = 15;
	private static final int NUM_MAXIMO_PUBLICACIONES = 50;
	

	private Usuario[] usuarios;
	
	
	public MemoryStorage() {
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		
	}

}
