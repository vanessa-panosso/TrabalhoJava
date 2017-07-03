package br.univel;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class ShapeFactory {
	@Any
	   @Inject
	   private Instance<Shape> shape;
	 
	   public Shape create(Forma type) {
	      if(Forma.RETANGULO.equals(type)){
	         return shape.select(Retangulo.class).get();
	      }
	      if(Forma.CIRCULO.equals(type)){
	         return shape.select(Circulo.class).get();
	      }
	      return null;
	   }
}
