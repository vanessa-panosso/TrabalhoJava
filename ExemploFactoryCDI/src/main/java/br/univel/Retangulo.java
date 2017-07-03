package br.univel;

import javax.annotation.PostConstruct;

public class Retangulo extends Shape {

	
	@PostConstruct
	   public void setUp() {
	      dependency.setName("Retangulo - dependency");
	   }
}
