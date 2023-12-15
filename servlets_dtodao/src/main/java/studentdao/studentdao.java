package studentdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import student.dto.studentdto;

public class studentdao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();
 public void insert(studentdto dto)
 {
	 et.begin();
	 em.persist(dto);
	 et.commit();
 }
}
