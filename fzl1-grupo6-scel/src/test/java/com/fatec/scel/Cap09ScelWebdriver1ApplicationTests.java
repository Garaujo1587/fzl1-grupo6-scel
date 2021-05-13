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
		
		boolean isbnCadastrado = lista.ISBNinvalido(livro.getIsbn());
	
		
		assertEquals(false, isbnCadastrado);
			
	}
	
	@Test
	public void CT03_CadastrarISBNEmBranco() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean isbnBranco = lista.ISBNinvalido(livro.getIsbn());
		
		
		assertEquals(false, isbnBranco);
	
	}
	
	@Test
	public void CT04_CadastrarTituloEmBranco() {
		Livro livro = new Livro("", "1234", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean tituloBranco = lista.TituloInvalido(livro.getTitulo());
		
		
		assertEquals(true, tituloBranco);
		
	}
	
	@Test
	public void CT05_CadastrarAutorEmBranco() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "1234", "");
		lista.cadastrarLivro(livro);
		
		boolean autorBranco = lista.AutorInvalido(livro.getAutor());
		
		
		assertEquals(true, autorBranco);
		
	}
	
	@Test
	public void CT06_CadastrarISBNInvalido() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "12345", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean isbnInvalido = lista.ISBNinvalido(livro.getIsbn());
		
		assertEquals(false, isbnInvalido);
	}

	@Test
	public void CT07_CadastrarTituloInvalido() {
		Livro livro = new Livro("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "1234", "Tanenbaum");
		lista.cadastrarLivro(livro);
		
		boolean tituloInvalido = lista.TituloInvalido(livro.getTitulo());
		
		assertEquals(true, tituloInvalido);
	}
	
	@Test
	public void CT08_CadastrarAutorInvalido() {
		Livro livro = new Livro("Sistemas Operacionais Modernos", "1234", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		lista.cadastrarLivro(livro);
		
		boolean autorInvalido = lista.AutorInvalido(livro.getAutor());
		
		assertEquals(true, autorInvalido);
	}
}
