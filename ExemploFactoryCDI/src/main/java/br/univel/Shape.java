package br.univel;

import javax.inject.Inject;

public abstract class Shape {
	 
	 @Inject
	protected ShapeDependency dependency;
	 
	   public ShapeDependency getDependency() {
	      return dependency;
	   }
	   
	  
	}