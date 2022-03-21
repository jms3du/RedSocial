package com.jacaranda.usuario;

public class Usuario {

	private String login;
	private String password;
	
	
	
	public Usuario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}



	public String getLogin() {
		return login;
	}
	
	
	public boolean setPass(String currentPass, String newPass) {
		
		return false;
	}
	
	
	public boolean checkPass(String currentPass) {
		return false;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}


}
