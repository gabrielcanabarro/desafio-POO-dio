package br.com.dio.desafio.dominio;

public abstract class Conteudo {          // abstract signica que n�o da pra instanciar conteudo
	
	protected static final double XP_PADRA0 = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
