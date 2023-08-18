package servlet_basics.dao;

import java.util.List;   

import javax.persistence.EntityManager;    
import javax.persistence.EntityManagerFactory; 
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_basics.dto.PatientDto;
 
public class PatientDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(PatientDto d1) {
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
	}
		
	public String deletebyid(int id) {
		PatientDto d1=entityManager.find(PatientDto.class, id);
		
		if(d1!=null) {
		entityTransaction.begin();
		entityManager.remove(d1);
		entityTransaction.commit();	
		
				return "data is deleted";
				
		}else {
			    return "no data found";
		      }
	}

	public Object findbyid(int id) {
		PatientDto d1=entityManager.find(PatientDto.class, id);
		
		if(d1!=null) {
				return d1;
		}else {
				return "no data found";
			  }
    }

	public List<PatientDto> fetchall() {
		
		// select variable_name from table_name(entity class) variable_name------>	
		Query q	=entityManager.createQuery("select data from PatientDto data");
		List<PatientDto> d1=q.getResultList();
			return d1;
		}

	public String update(int cid, long cnumber) {
		// TODO Auto-generated method stub
		PatientDto d1=entityManager.find(PatientDto.class, cid);
		d1.setNumber(cnumber);
		
		entityTransaction.begin();
		entityManager.merge(d1);
		entityTransaction.commit();
		
		return "update successfully";
	}

	public void updateall(PatientDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();
	}

	public String deleteAll() {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select data from PatientDto data");
		List<PatientDto> list=q.getResultList();
		for(PatientDto l1:list)
		{
			entityTransaction.begin();
			entityManager.remove(l1);
			entityTransaction.commit();
		}
		return "data is deleted";
	}
	
	
	
}
























