/*******************************************************************************
 * Copyright (c) 2017 This is my Application, dont us it without my permission
 * Creator and Projekt-Lead Barico
 *
 * Contributors: PRODYNA AG - All rights reserved
 *******************************************************************************/
package org.jboss.own.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.own.register.UserRegistration;
import org.jboss.own.test.AppUser;

/**
 * @author batas
 *
 */
@Model
@Named("controller")
public class FacesController {

    @Inject
    private UserRegistration register;

    @Produces
    @Named
    private AppUser newUser;

    @PostConstruct
    public void init() {
        newUser = new AppUser();
    }

    public FacesController() {
    }

    public void register() {
        register.register(newUser);
    }

}
