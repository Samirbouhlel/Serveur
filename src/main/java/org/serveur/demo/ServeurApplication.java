package org.serveur.demo;

import org.serveur.demo.entity.Produit;
import org.serveur.demo.repository.ProduitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ServeurApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(ServeurApplication.class, args);
	/*ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
	
	produitRepository.save(new Produit("livre",50,20));
	produitRepository.save(new Produit("cahier",200,5.25f));
	produitRepository.save(new Produit("stylo",500,2.10f));*/
	}
}
