package com.jacaranda.publicacion;

public class PublicacionException extends RuntimeException {

	public PublicacionException() {
		super();
	}

	public PublicacionException(String message) {
		super(message);
	}

	public PublicacionException(Throwable cause) {
		super(cause);
	}

	public PublicacionException(String message, Throwable cause) {
		super(message, cause);
	}

	public PublicacionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
