/*******************************************************************************
 * Copyright (c) 2017 This is my Application, dont us it without my permission
 * Creator and Projekt-Lead Barico
 *
 * Contributors: PRODYNA AG - All rights reserved
 *******************************************************************************/
package org.jboss.own.register;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.jboss.own.model.AppUser;
import org.jboss.own.userrepo.UserRepository;

@Stateless
@Named
public class UserRegistration implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserRegistration() {
    }

    @Inject
    private UserRepository userRepo;

    @Inject
    private EntityManager entityManager;

    @PostConstruct
    public void initList() {
        userRepo.fillDatabaseUserList();
    }

    public void register(final AppUser user) {
        try {
            entityManager.persist(user);
            userRepo.fillDatabaseUserList();
        }
        catch (final Exception e) {

        }
    }

}
