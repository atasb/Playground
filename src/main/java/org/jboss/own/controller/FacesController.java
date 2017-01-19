package org.jboss.own.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.own.register.UserRegistration;
import org.jboss.own.test.AppUser;

@Model
@Named("controller")
public class FacesController {

    public FacesController() {

    }

    @Inject
    private UserRegistration register;

    @Produces
    @Named
    private AppUser newUser;

    @PostConstruct
    public void init() {
        newUser = new AppUser();
    }

    public void register() {
        register.register(newUser);
    }

}
