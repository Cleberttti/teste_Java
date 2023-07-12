package novo;

 public abstract class filme {
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private Integer ano_lançamento;
	@SuppressWarnings("unused")
	private String genero;
	
	public filme(String nome, Integer ano_lançamento, String genero) {
		super();
		this.nome = nome;
		this.ano_lançamento = ano_lançamento;
		this.genero = genero;
	}
	
	public filme() {} 
	

}
