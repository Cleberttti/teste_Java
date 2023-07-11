package novo;

public class produto {
	public String name;
	public double price;
	public int quantity;
	
	public produto(String name, double price, int quantity){//construtor parametros
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public produto() {}//construtor padrao, sobrecarga
	
	@Override
	public String toString() {//para ler o construtor no console
		return "produto [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
		
	

}
