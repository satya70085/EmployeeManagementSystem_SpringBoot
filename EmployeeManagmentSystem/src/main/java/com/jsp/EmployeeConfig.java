package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jsp")
public class EmployeeConfig {
	@Bean //Return entity manager object  to IOC
	public EntityManager getEntityManager()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("bapu");
		
		return factory.createEntityManager();
		
		
	}
	@Bean //return entity transaction object to IOc
	public EntityTransaction getEntityTransaction()
	{
		return getEntityManager().getTransaction();
	}

}
