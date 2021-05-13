package com.fatec.scel;
import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

	List<Livro> listaDeLivros = new ArrayList<Livro>();
	
	public void cadastrarLivro(Livro livro) {
		listaDeLivros.add(livro);
		System.out.println("Livro cadastrado");
	}
	
	public boolean ISBNCadastrado(String isbn) {
	
		for(Livro livro : listaDeLivros) {
			if(livro.getIsbn().equalsIgnoreCase(isbn)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean ISBNemBranco(String isbn) {
		
		return isbn.isBlank();
	}
	
	public boolean tituloEmBranco(String titulo) {
		return titulo.isBlank();
	}
	
	public boolean autorEmBranco(String autor) {
		return autor.isBlank();
	}
}