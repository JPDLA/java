package com.utn.vista;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.utn.dao.HibernateUtil;
import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Persona p = new Persona();
		p.setNombre("Fulano");
		p.setApellido("Perez");
		p.setEdad(22);
		session.save(p);
		session.getTransaction().commit();
		
		session.beginTransaction();

		List<Persona> personas = session.createCriteria(Persona.class).list();
		
		session.getTransaction().commit();
		
		for (Object item : personas) {
			System.out.println(((Persona)item).getApellido());
		}
		
		
	}

}
