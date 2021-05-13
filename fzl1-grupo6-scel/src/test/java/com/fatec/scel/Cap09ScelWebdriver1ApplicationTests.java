package com.fatec.scel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cap09ScelWebdriver1ApplicationTests {
	ListaLivros lista = new ListaLivros();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void CT01_CadastrarLivroSucesso() {
		
		Livro livro = new Livro("Sistemas Operacionais Modernos", "1234", "Tanenbaum");
		
		lista.cadastrarLivro(livro);
		
		assertEquals(1, lista.listaDeLivros.size());
	}
	
	
	@Test
	public void CT02_CadastrarISBNCadastrado() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "1234", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean isbnCadastrado = lista.ISBNCadastrado(livro.getIsbn());
	
		
		assertEquals(true, isbnCadastrado);
			
	}
	
	@Test
	public void CT03_CadastrarISBNEmBranco() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean isbnBranco = lista.ISBNemBranco(livro.getIsbn());
		
		
		assertEquals(true, isbnBranco);
	
	}
	
	@Test
	public void CT04_CadastrarTituloEmBranco() {
		Livro livro = new Livro("", "1234", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean tituloBranco = lista.tituloEmBranco(livro.getTitulo());
		
		
		assertEquals(true, tituloBranco);
		
	}
	
	@Test
	public void CT05_CadastrarAutorEmBranco() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "1234", "");
		lista.cadastrarLivro(livro);
		
		boolean autorBranco = lista.autorEmBranco(livro.getAutor());
		
		
		assertEquals(true, autorBranco);
		
	}

}
