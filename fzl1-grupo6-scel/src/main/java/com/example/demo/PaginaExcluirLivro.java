package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class PaginaExcluirLivro {

	private WebDriver driver;

	private By usernameBy = By.name("username");
	private By passwordBy = By.name("password");

	private By isbnBy = By.id("isbn");
	private By autorBy = By.id("autor");
	private By tituloBy = By.id("titulo");

	public PaginaExcluirLivro(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaExcluirLivro excluirLivro(String user, String pass, int isbn, String autor, String titulo) {
		driver.get("https://ts-scel.herokuapp.com/login");
		driver.manage().window().setSize(new Dimension(804, 744));
		driver.findElement(usernameBy).click();
		driver.findElement(usernameBy).sendKeys(user);
		driver.findElement(passwordBy).sendKeys(pass);
		driver.findElement(By.cssSelector("button")).click();
		driver.findElement(By.linkText("Livros")).click();
		driver.findElement(isbnBy).click();
		driver.findElement(isbnBy).sendKeys(String.valueOf(isbn));
		driver.findElement(autorBy).sendKeys(autor);
		driver.findElement(tituloBy).click();
		driver.findElement(tituloBy).sendKeys(titulo);
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector("tr:nth-child(2) .delete")).click();
		
		return new PaginaExcluirLivro(driver);
	}
}