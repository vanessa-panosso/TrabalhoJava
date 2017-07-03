package br.univel.dao;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.univel.model.Produto;

public class ProdutoDaoImpl implements ProdutoDao{
	
   private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExemploCDiEscopo-persistence-unit");
	 
   @Produces 
   @RequestScoped
   public EntityManager criaEntityManager() {
      return factory.createEntityManager();
   }
   public void finaliza(@Disposes EntityManager manager) {
	   manager.close();
   }
   @Override
   public Produto cadastrar(Produto produto) {
	   EntityManager em = criaEntityManager();
	   em.persist(produto);
	   return produto;
	}
}
