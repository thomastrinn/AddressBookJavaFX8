package com.thomas.addressbook.business;

import com.thomas.addressbook.business.entity.Person;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author thomas
 */
public class PersonLoader {

    @Inject
    private EntityManager em;
    
    public List<Person> loadAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Person> cq = cb.createQuery(Person.class);
        
        return em.createQuery(cq).getResultList();
    }
}
