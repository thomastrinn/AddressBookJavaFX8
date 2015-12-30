package com.thomas.addressbook.business;

import com.thomas.addressbook.business.entity.Person;
import com.thomas.addressbook.transaction.Transactional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author thomas
 */
@Transactional
public class PersonSaver {
    
    @Inject
    private EntityManager em;
    
    public void save(Person person) {
        em.persist(person);
    }

}
