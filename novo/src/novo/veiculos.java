package novo;

public class veiculos implements interfaces{
	private String tipo;
	private String marca;
	private String modelo;
	private int velocidade;
	public veiculos(String tipo,String marca,String modelo,int velocidade) {
		this.tipo=tipo;
		this.marca=marca;
		this.modelo=modelo;
		this.velocidade=velocidade;
	}
	@Override
	public void ligar_turbo() {
		velocidade *=2;
		
	}
	@Override
	public void desligar_turbo() {
		velocidade=100;
		
	}
	@Override
	public String toString() {
		return "veiculos [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
