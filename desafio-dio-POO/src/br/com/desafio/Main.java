package br.com.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrica curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("curso JS");
		curso1.setDescricao("descrica curso JS");
		curso1.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descricao mentoria Java");
		mentoria.setData(LocalDate.now());
	}
}
	
	
