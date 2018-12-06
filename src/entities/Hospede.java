package entities;

public class Hospede {

	private String name;
	private String email;
	
	public Hospede(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name + ", " + email;
	}
	
	
	
}
