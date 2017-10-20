package com.imfe.ejercicio3.pojos;

public class Usuario {
	//Atributos
	private String nombre;
	private String pass;
	
	/*
	 * @param nombre - nombre de usuario
	 * @param pass - contraseña del usuario
	 */
	
	//Constructores
	public Usuario(String nombre,String pass){
		this.nombre=nombre;
		this.pass=pass;
		
	}
	
	//Métodos
	
	//Getters and Setters
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre(String nombreNuevo) {
		this.nombre=nombreNuevo;
	}
	
	public String getPass() {
		return this.pass;
	}
	
	public void setPass(String nuevaPass) {
		this.pass=nuevaPass;
	}
	
	//ToString
	public String toString() {
		String passEcryptado="";
		
		for(int i=0; i<=this.pass.length()+1; i++) {
		
				passEcryptado+="*";
		}
		return "Usuario [usuario="+nombre+",pass="+passEcryptado+"]";
		
	}

}
