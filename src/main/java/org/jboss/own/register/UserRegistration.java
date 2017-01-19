package org.jboss.own.register;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.own.test.AppUser;

@Stateless
public class UserRegistration {

    public UserRegistration() {
    }

    @Inject
    private EntityManager em;

    public void register(final AppUser user) {
        em.persist(user);
    }
}
