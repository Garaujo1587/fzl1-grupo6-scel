package com.fatec.scel;

public class Livro {

	private String titulo;
	private String isbn;
	private String autor;
	
	public Livro(String t, String i, String a) {
		setIsbn(i);
		setTitulo(t);
		setAutor(a);
	}
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
