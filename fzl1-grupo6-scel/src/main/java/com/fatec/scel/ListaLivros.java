package com.fatec.scel;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

	List<Livro> listaDeLivros = new ArrayList<Livro>();

	public void cadastrarLivro(Livro livro) {
		listaDeLivros.add(livro);
		System.out.println("Livro cadastrado");
	}

	public boolean ISBNinvalido(String isbn) {
		for (Livro livro : listaDeLivros) {
			if (livro.getIsbn().length() == 4) {
				if (livro.getIsbn().equalsIgnoreCase(isbn)) {
					System.out.println("ISBN já cadastrado");
					return false;
				} else {
					System.out.println("ISBN correto");
					return true;
				}
			}
		}
		System.out.println("ISBN invalido, ele nao apresenta 4 caracteres");
		return false;
	}

	public boolean TituloInvalido(String titulo) {
		for (Livro livro : listaDeLivros) {
			if (livro.getTitulo().length() > 50) {
				System.out.println("Titulo invalido, tem mais de 50 caracteres");
				return true;
			}

			if (livro.getTitulo().length() == 0) {
				System.out.println("Titulo em branco");
				return titulo.isBlank();
			}
		}
		System.out.println("Titulo valido");
		return false;
	}

	public boolean AutorInvalido(String autor) {
		for (Livro livro : listaDeLivros) {
			if (livro.getAutor().length() > 50) {
				System.out.println("Autor invalido, tem mais de 50 caracteres");
				return true;
			}

			if (livro.getAutor().length() == 0) {
				System.out.println("Titulo em branco");
				return autor.isBlank();
			}
		}
		System.out.println("Autor valido");
		return false;
	}

}