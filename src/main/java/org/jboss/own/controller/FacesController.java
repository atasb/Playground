/*******************************************************************************
 *
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

import org.jboss.own.model.AppUser;
import org.jboss.own.model.LoginUser;
import org.jboss.own.register.UserRegistration;

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
        newUser = new LoginUser();
    }

    public FacesController() {
    }

    public String login() {
        register.initList();
        init();
        return "welcome?faces-redirect=true";
    }

    public String register() {
        register.register(newUser);
        init();
        return "welcome?faces-redirect=true";
    }

    public void submit() {

    }

}
