package novo;

public class encapisulando {//encapisolamento
	private String nome;
	private int age;
	private double altura;
	
	
	public encapisulando(String nome, int age, double altura) {
		
		this.nome = nome;
		this.age = age;
		this.altura = altura;
	}
	public String getNome() {//getter
		return nome;
	}
	public void setNome(String nome) {//setter
		this.nome = nome;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
