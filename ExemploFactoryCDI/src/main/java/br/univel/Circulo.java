package br.univel;

import javax.annotation.PostConstruct;

public class Circulo extends Shape {
	 
	@PostConstruct
	   public void setUp() {
	      dependency.setName("Circle dependency");
	   }
}
