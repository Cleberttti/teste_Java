package novo;

public class NewProject extends filme { //herança
	private String tipo;
	private Long orçamento;
	public NewProject(String nome, Integer ano_lançamento, String genero, String tipo, Long orçamento) {
		super(nome, ano_lançamento, genero);//o super e da classe base
		this.tipo = tipo;
		this.orçamento = orçamento;
	}
	@Override
	public String toString() {
		return "NewProject [tipo=" + tipo + ", orçamento=" + orçamento + "]";
	}
	
	
	
	
	

}
