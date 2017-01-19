/*******************************************************************************
 * Copyright (c) 2017 This is my Application, dont us it without my permission
 * Creator and Projekt-Lead
 * Barico
 *
 * Contributors:
 *     PRODYNA AG - All rights reserved
 *******************************************************************************/
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
