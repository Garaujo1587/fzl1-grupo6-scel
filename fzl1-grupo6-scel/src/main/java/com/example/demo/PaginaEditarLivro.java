package com.example.demo;

import org.apache.tomcat.jni.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class PaginaEditarLivro {

	private WebDriver driver;

	private By usernameBy = By.name("username");
	private By passwordBy = By.name("password");

	private By tituloBy = By.id("titulo");

	public PaginaEditarLivro(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaEditarLivro editarLivro(String user, String pass, String titulo) {
		driver.get("https://ts-scel.herokuapp.com/login");
		driver.manage().window().setSize(new Dimension(804, 744));
		driver.findElement(usernameBy).click();
		driver.findElement(usernameBy).sendKeys(user);
		driver.findElement(passwordBy).sendKeys(pass);
		driver.findElement(By.cssSelector("button")).click();

		espera();
		driver.findElement(By.linkText("Livros")).click();
		driver.findElement(By.linkText("Lista de Livros")).click();
		driver.findElement(By.linkText("Editar")).click();
		driver.findElement(tituloBy).click();
		driver.findElement(tituloBy).sendKeys(titulo);
		driver.findElement(By.cssSelector(".btn")).click();

		return new PaginaEditarLivro(driver);
	}

	private void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}